package com.github.mrzhqiang;

import javax.annotation.Nullable;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountDao {

    private Connection connection;

    public AccountDao(Connection connection) {
        this.connection = connection;
    }

    /** 挑选所有的账号出来 */
    public List<Account> selectAll() {
        List<Account> accounts = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet =
                    statement.executeQuery("SELECT * FROM account LEFT JOIN user ON account.u_id = user.user_id");
            while (resultSet.next()) {
                accounts.add(new Account().of(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    /** 通过用户名和密码，验证账号是否存在 */
    @Nullable
    public Account loginAccount(String name, String pswd) {
        Account account = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet =
                    statement.executeQuery("SELECT * FROM account LEFT JOIN user ON account.u_id = user.user_id " +
                            "WHERE username = '" + name + "' and password = '" + pswd + "'");
            if (resultSet.next()) {
                account = new Account().of(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return account;
    }

    /** 通过用户填写的资料，申请随机账号 */
    @Nullable
    public Map<String, User> usernameOf(User user) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT user (nickname, sex, brithday, mobile, e_mail, city, signature, description) " +
                            "VALUE(?, ?, ?, ?, ?, ?, ?, ?)");
            user.with(statement);
            user.id = statement.executeUpdate();
            // FIXME 存在未验证的随机账号，可能导致注册账号失败——解决：放到外面去处理随机账号
            long randomUsername = (long) (10000 + Math.random() * 90000);
            Map<String, User> result = new HashMap<>(1);
            result.put(String.valueOf(randomUsername), user);
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // zyk 任务
    // TODO 插入账号，记住u_id = User.id
    // TODO 删除账号，需要注意的是，先删除账号，再删除用户资料
}

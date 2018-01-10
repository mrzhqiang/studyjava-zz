import com.github.mrzhqiang.Account;
import com.github.mrzhqiang.AccountDao;
import com.github.mrzhqiang.DatabaseImp;
import com.github.mrzhqiang.User;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        Connection connection = DatabaseImp.create().connect();

        // 1.插入
        /*String sql = "insert account (username, password, sex, age) value(?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "mrzhqiang");
        preparedStatement.setString(2, "123456");
        preparedStatement.setString(3, "男");
        preparedStatement.setInt(4, 25);
        preparedStatement.executeUpdate();*/

        // 2.查询
        /*Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM account LEFT JOIN user u ON account.u_id = u.user_id");
        while (rs.next()) {
            *//*Account account = new Account();
            account.username = rs.getString(1);
            account.password = rs.getString("password");
            account.sex = rs.getString(3);
            account.age = rs.getInt(4);
            System.out.println(account);*//*

            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt(3));
            System.out.println(rs.getInt(4));
            System.out.println(rs.getInt(5));
            System.out.println(rs.getString(6));
            System.out.println(rs.getInt(7));
            System.out.println(rs.getDate(8));
            System.out.println(rs.getString(9));
            System.out.println(rs.getString(10));
            System.out.println(rs.getInt(11));
            System.out.println(rs.getString(12));
            System.out.println(rs.getString(13));
        }*/

        // 3.更新
//        String sql = "update user set city = 210000/* where user_id = 1*/";
//        statement.executeUpdate(sql);

        // 4.删除
        /*String sql = "DELETE FROM account WHERE username = 'test'";
        int count = statement.executeUpdate(sql);
        System.out.println("删除了 " + count + " 行数据");

        // 5.模糊查询
        ResultSet query = statement.executeQuery("SELECT brithday FROM user WHERE nickname LIKE '%三%'");
        while (query.next()) {
            Date date = query.getDate(1);
            System.out.println(date);
        }*/

        // 范例2测试
        AccountDao accountDao = new AccountDao(connection);
        Account account = accountDao.loginAccount("10000", "123456");
        if (account == null) {
            System.err.println("登录失败！");
        } else {
            System.out.println("登录成功：" + account.toString());
        }

        System.out.println(accountDao.selectAll());

        User user = new User();
        user.nickname = "111";
        System.out.println(accountDao.usernameOf(user));

        // 关闭连接
        connection.close();
    }
}

import com.github.mrzhqiang.Account;
import com.github.mrzhqiang.DatabaseImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM account");
        while (rs.next()) {
            Account account = new Account();
            account.username = rs.getString(1);
            account.password = rs.getString("password");
            account.sex = rs.getString(3);
            account.age = rs.getInt(4);
            System.out.println(account);
        }

        connection.close();
    }
}

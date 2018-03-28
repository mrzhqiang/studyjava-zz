package com.github.mrzhqiang;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String driver = "com.mysql.jdbc.Driver";
    Connection con;
    String url = "jdbc:mysql://localhost:3306/chatper17";
    String user = "root";
    String password = "pass";

    try {
      Class.forName(driver);
      con = DriverManager.getConnection(url, user, password);

      if (!con.isClosed()) {
        System.out.println("Succeeded connecting to the Database!");
      }

      System.out.println("请输入一个用户名：");
      Scanner scanner = new Scanner(System.in);
      String line = scanner.nextLine();

      Account account = new Account();
      account.setMobile(line);
      account.generatePassword();

      PreparedStatement statement = con.prepareStatement(
          "INSERT INTO chatper17.account (username, password, mobile) VALUES (?,?,?)");

      statement.setString(1, account.username);
      statement.setString(2, account.password);
      statement.setString(3, account.mobile);

      statement.execute();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

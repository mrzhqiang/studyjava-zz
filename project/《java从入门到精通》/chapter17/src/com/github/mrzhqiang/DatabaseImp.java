package com.github.mrzhqiang;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseImp implements IDatabase {

    // localhost ==> 112.81.4.230
    private static final String DB_URL = "jdbc:mysql://localhost:3306/chatper17";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    // TODO 替换为 youkuanzeng 123456
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    @Override
    public Connection connect() throws Exception {
        Class.forName(DRIVER);
        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }

    public static IDatabase create() {
        return new DatabaseImp();
    }

    private DatabaseImp() {
    }
}

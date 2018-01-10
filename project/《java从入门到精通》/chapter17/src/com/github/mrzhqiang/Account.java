package com.github.mrzhqiang;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Account {
    public String username;
    public String password;
    public User user;
    public int type;

    public Account of(ResultSet rs) throws SQLException {
        username = rs.getString("username");
        password = rs.getString("password");
        user = new User().of(rs);
        return this;
    }

    @Override
    public String toString() {
        return "Account: username=" + username + ", password=" + password + ", user=" + user + ", type=" + type;
    }
}

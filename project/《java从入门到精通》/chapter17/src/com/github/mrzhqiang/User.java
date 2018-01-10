package com.github.mrzhqiang;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    public long id;
    public String nickname;
    public int sex = 0;
    public Date brithday = new Date(System.currentTimeMillis());
    public String mobile = "";
    public String eMail = "";
    public int city = 0;
    public String signature = "";
    public String description = "";

    public User of(ResultSet rs) throws SQLException {
        id = rs.getLong("user_id");
        nickname = rs.getString("nickname");
        sex = rs.getInt("sex");
        brithday = rs.getDate("brithday");
        mobile = rs.getString("mobile");
        eMail = rs.getString("e_mail");
        city = rs.getInt("city");
        signature = rs.getString("signature");
        description = rs.getString("description");
        return this;
    }

    @Override
    public String toString() {
        return "User: id=" + id
                + ", nickname=" + nickname
                + ", sex=" + sex
                + ", brithday=" + brithday
                + ", mobile=" + mobile
                + ", e-mail=" + eMail
                + ", city=" + city
                + ", signature=" + signature
                + ", description=" + description;
    }

    public void with(PreparedStatement statement) throws SQLException {
        statement.setString(1, nickname);
        statement.setInt(2, sex);
        statement.setDate(3, brithday);
        statement.setString(4, mobile);
        statement.setString(5, eMail);
        statement.setInt(6, city);
        statement.setString(7, signature);
        statement.setString(8, description);
    }
}

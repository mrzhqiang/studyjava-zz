package com.github.mrzhqiang;

public class Account {
    public String username;
    public String password;
    public String sex;
    public int age;

    @Override
    public String toString() {
        return "Account: username=" + username + ", password=" + password + ", sex=" + sex + ", age=" + age;
    }
}

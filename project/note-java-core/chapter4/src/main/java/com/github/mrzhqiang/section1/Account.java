package com.github.mrzhqiang.section1;

import com.google.common.base.MoreObjects;
import java.security.SecureRandom;
import java.util.Date;
import java.util.Objects;
import java.util.Random;

/** 账户 */
public class Account {
  private static Random RANDOM = new SecureRandom();

  private String name;
  private String pswd;
  private int level;
  private Date created;

  public static Account create(String username, String password) {
    Account account = new Account();
    account.name = username;
    account.pswd = password;
    account.level = RANDOM.nextInt(100);
    account.created = new Date();
    return account;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getPswd() {
    return pswd;
  }

  public void setPswd(String pswd) {
    this.pswd = pswd;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public long getCreated() {
    return created.getTime();
  }

  public void setCreated(long created) {
    this.created = new Date(created);
  }

  @Override public int hashCode() {
    return Objects.hash(name, pswd, level, created);
  }

  @Override public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Account)) {
      return false;
    }

    Account other = (Account) obj;
    return Objects.equals(name, other.name)
        && Objects.equals(pswd, other.pswd)
        && Objects.equals(level, other.level)
        && Objects.equals(created, other.created);
  }

  @Override public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("name", name)
        .add("pswd", pswd)
        .add("level", level)
        .add("created", created)
        .toString();
  }
}

package com.github.mrzhqiang;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.Random;

public class Account {
  public String username;
  public String password;
  public String mobile;

  public void setUsername(String username) throws IOException {
    if (username == null) {
      System.err.println("username can not is null.");
      return;
    }
    if (username.length() >= 6 && username.length() <= 16) {
      this.username = username;
    } else {
      throw new IOException("username is error: " + username);
    }
  }

  private static String CHARS_LOWER = "abcdefghijklmnopqrstuvwxyz";
  private static String CHARS_UPPER = CHARS_LOWER.toUpperCase();
  private static String NUMBER = "0123456789";

  private static String WORD = CHARS_LOWER + CHARS_UPPER + NUMBER;

  private static Random RANDOM = new SecureRandom();
  private static int min = 6;
  private static int max = 16;

  public void generatePassword() {
    // 6 + [0,10] >>> 6 -- 16
    int length = min + RANDOM.nextInt(max - min);

    StringBuilder builder = new StringBuilder(length);
    for (int i = 0; i < length; i++) {
      int randomIndex = RANDOM.nextInt(WORD.length());
      builder.append(WORD.charAt(randomIndex));
    }
    this.password = builder.toString();
  }

  public void setMobile(String value) throws IOException {
    if (value.matches("^1[3|4|5|8][0-9]\\d{4,8}$")) {
      this.mobile = value;
    } else {
      setUsername(value);
    }
  }
}

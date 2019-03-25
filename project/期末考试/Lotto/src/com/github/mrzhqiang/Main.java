package com.github.mrzhqiang;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Account account = new Account();
    System.out.println("欢迎用户：" + account.getId() + " 来到抽奖系统，请按回车进行抽奖（输入 esc 退出程序）。");
    String line = scanner.nextLine();
    while (!line.equals("esc")) {
      account.extract();
      System.out.println("继续按回车进行抽奖（输入 esc 退出程序）。");
      line = scanner.nextLine();
    }
  }
}

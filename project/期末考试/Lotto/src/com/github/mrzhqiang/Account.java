package com.github.mrzhqiang;

public class Account {
  private static int nextId = 1;

  private int id;
  private int money;

  public Account() {
    this.id = nextId;
    nextId++;
    this.money = 10000;
  }

  public int getId() {
    return id;
  }

  public void extract() {
    if (money >= 50) {
      money = money - 50;
      int level = Prize.extract();
      switch (level) {
        case Level.LV_NOT:
          System.out.println("抱歉，用户 " + id + " 未中奖！");
          break;
        case Level.LV_A:
          money = money + 50;
          System.out.println("恭喜，用户 " + id + " 中了安慰奖！");
          break;
        case Level.LV_1:
          money = money + 1000;
          System.out.println("恭喜，用户 " + id + " 中了一等奖！");
          break;
        case Level.LV_2:
          money = money + 200;
          System.out.println("恭喜，用户 " + id + " 中了二等奖！");
          break;
        case Level.LV_3:
          money = money + 100;
          System.out.println("恭喜，用户 " + id + " 中了三等奖！");
          break;
      }
      System.out.println("用户当前还剩金钱：" + money);
    } else {
      System.out.println("用户当前金钱余额不足，请及时充值。");
    }
  }
}

package com.github.mrzhqiang.section1;

/** 4.1 面向对象程序设计概述 */
public interface OOPDemo {
  boolean login(Account account);

  boolean logout(Account account);

  Order createOrider(Item item);

  void pay(Payment payment);

  void inputInfo(ShippingAdress adress);
}

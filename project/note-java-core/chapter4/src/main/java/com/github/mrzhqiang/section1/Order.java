package com.github.mrzhqiang.section1;

import java.util.ArrayList;
import java.util.List;

/** 订单 */
public class Order {
  /**
   * 商品被添加到订单中，所以商品对于订单来说，是多个对一个的关系。
   * <p>
   * 从订单的角度来看，它聚合了一些商品。从商品的角度来看，订单提供了商品的容身之处。
   */
  private final List<Item> itemList = new ArrayList<>();

  /** 对象字段都是对这个对象所属类的一种依赖 */
  private final Account account;

  /** 订单是跟着账户走的，没有哪一个订单不需要账户信息，只有用户才可以创建订单，否则就是刷数据了 */
  public Order(Account account) {
    this.account = account;
  }

  /** 添加商品 */
  public void addItem(Item item) {
    if (item != null) {
      itemList.add(item);
    }
  }
}

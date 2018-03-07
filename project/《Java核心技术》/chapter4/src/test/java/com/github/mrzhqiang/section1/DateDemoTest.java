package com.github.mrzhqiang.section1;

import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

public class DateDemoTest {

  @Test
  public void constructionDate() {
    // 对象的变量，引用对象的地址值，通过这个引用，可以访问对象的公开信息，比如属性和方法，
    // 这也称之为字段和函数。
    // 一般的认知是，类是由属性和方法组成的结构，程序员通过new关键字来生成类的对象，
    // 这个对象在内存中真实存在，换个说法：它是按照类描述生成的类实例——对象。
    // 而对象的地址值，将交给对象变量引用。
    Date date = new Date();
    System.out.println(date.toString());

    // 对象变量可以显式地设置为null，这样垃圾回收器将会回收迷失的Date对象，而data变量显然不能再使用
    date = null;
    Assert.assertNull(date);

    // 值为null的变量是不能调用的，否则将产生空指针错误：
    try {
      date.toString();
    } catch (Exception e) {
      System.out.println(e.getLocalizedMessage());
    }

    // 局部变量不会自动初始化，必须显示地设置值，比如设置为null或调用new产生一个对象设置给它
    Date dateLocal = new Date();
    Assert.assertNotNull(dateLocal);

    // 书中的这一节，对于Date类没有过多地讲解，那么到此告一段落
  }
}

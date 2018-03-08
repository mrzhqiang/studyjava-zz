package com.github.mrzhqiang.section6;

import org.junit.Test;

public class ObjectLoadTest {
  @Test
  public void testStaticValue() {
    // 调用一个类的静态域
    System.out.println(Construction.HELLO_1);
    // 执行顺序是：
    // 1. 将所有静态域初始化，不区分权限范围，是常量还是静态变量也无所谓
    // 2. 调用静态初始化块，由于它在类声明中的顺序比较靠后，所以执行顺序也靠后了
    // 3. 最后是执行到调用的地方，结束

    // 调用一个类的静态域，会导致类中的所有静态域被初始化，包括静态初始化块，执行的顺序对应声明顺序
  }

  @Test
  public void testInstance() {
    // 调用一个类的实例——对象
    System.out.println(new Construction());
    // 执行顺序是：
    // 1. 优先处理静态代码（静态字段，静态语句块），将按照在类声明中的顺序逐个执行
    // 2. 接着处理第一个调用的构造器，如果在其中有new对象，那么首先执行这些new操作
    // 3. 然后执行初始化语句块，以及对象域的所有初始化赋值
    // 4. 由于第一个构造器调用了第二个构造器，因此执行第二个构造器中的操作
    // 5. 第二个构造器完成后，第一个构造器也结束运行

    // new一个类的实例时，首先按照顺序执行静态代码，包括：常量、类变量、静态语句块
    // 由于调用的构造器使用了this访问其他构造器，那么进入其他构造器的主体逻辑
    // 检查到类中拥有初始化语句块，这部分内容被移入到其他构造器中执行
    // 又检查到在对象域上，有声明后立即赋值的操作，那这些操作将被移入其他构造器中执行
    // 然后执行其他构造器的主体逻辑，完成new实例的过程
  }
}

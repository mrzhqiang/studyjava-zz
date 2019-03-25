package com.github.mrzhqiang.section6;

/** 4.6 对象构造 */
public class Construction {
  // 4.6.1 重载
  // 一个类有多个构造器，这种特征叫重载。
  // 如果多个方法，有相同的名字、不同的参数，便产生了重载。
  // 开发者使用这些方法时，编译器必须挑选出具体执行哪个方法，通过用各个方法给出的参数类型与特定方法
  // 调用所使用的值类型进行匹配，来挑选出相应的方法。如果编译器找不到匹配的参数，就会产生编译时错误，
  // 因为根本不存在匹配，或者没有一个合适的方法。——这个过程叫，重载解析。

  // 4.6.7 初始化块
  // 1. 所有数据域被初始化为默认值
  // 2. 按照在类声明中出现的次序，依次执行所有域初始化语句和初始化块
  // 3. 如果构造器第一行调用了第二个构造器，则执行第二个构造器主体
  // 4. 执行这个构造器的主体

  // 可以设计一个类，包含所有特性，然后利用一些技巧检验类的初始化过程

  // 1. 常量或类变量，按照访问权限顺序排列
  public static final Hello HELLO_1 = new Hello(1);
  static final Hello HELLO_2 = new Hello(2);
  protected static final Hello HELLO_3 = new Hello(3);
  private static final Hello HELLO_4 = new Hello(4);
  public static Hello HELLO_5 = new Hello(5);
  static Hello HELLO_6 = new Hello(6);
  protected static Hello HELLO_7 = new Hello(7);
  private static Hello HELLO_8 = new Hello(8);

  // 2. 静态初始化块
  static {
    System.out.println("I am a static initial chunk");
  }

  // 3. 初始化块
  {
    System.out.println("I am a initial chunk");
  }

  // 4. 数据域
  public final Hello h1 = new Hello(1001);
  final Hello h2 = new Hello(1002);
  protected final Hello h3 = new Hello(1003);
  private final Hello h4 = new Hello(1004);
  public Hello h5 = new Hello(1005);
  Hello h6 = new Hello(1006);
  protected Hello h7 = new Hello(1007);
  private Hello h8 = new Hello(1008);

  // 5. 构造方法

  public Construction() {
    this(new Hello(1015), new Hello(1016), new Hello(1017), new Hello(1018));
    System.out.println("I am a construction of no param");
  }

  public Construction(Hello h5,
      Hello h6, Hello h7, Hello h8) {
    System.out.println("I am a construction of all param");
    this.h5 = h5;
    this.h6 = h6;
    this.h7 = h7;
    this.h8 = h8;
  }

  @Override public String toString() {
    return "h1="
        + h1.toString()
        + ", h2="
        + h2.toString()
        + ", h3="
        + h3.toString()
        + ", h4="
        + h4.toString()
        + ", h5="
        + h5.toString()
        + ", h6="
        + h6.toString()
        + ", h7="
        + h7.toString()
        + ", h8="
        + h8.toString();
  }

  public static class Hello {
    private final int id;

    public Hello(int id) {
      this.id = id;
      System.out.println(this.getClass().getSimpleName() + ":" + id);
    }

    @Override public String toString() {
      return "id=" + id;
    }
  }

  // 4.6.8 对象析构域finalize方法

  @Override protected void finalize() throws Throwable {
    // 这个方法将在垃圾回收器清除对象之前调用，但不要依赖这个方法，因为很难知道什么时候会调用
    // 如果有一些资源长时间打开，依赖于垃圾回收器清除时关闭资源，那么就会显得很蛋疼
    super.finalize();
    // 使用
    //System.runFinalizersOnExit(true);
    // 能够确保当前方法在清除对象之前，被垃圾回收器调用，但这个方法已经过时，不推荐使用
    // 替代的方案是
    //Runtime.getRuntime().addShutdownHook();
    // 添加关闭钩，详细内容需要进入源码查看API

    // 如果仅仅是在资源使用完毕之后关闭，那么可以使用一个叫close的方法
    // 在7.2.5节将会实践它
  }
}


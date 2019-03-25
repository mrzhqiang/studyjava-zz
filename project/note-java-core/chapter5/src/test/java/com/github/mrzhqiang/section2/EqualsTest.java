package com.github.mrzhqiang.section2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EqualsTest {

  private Point origin;
  private Point endX;
  private Point endY;
  private Point newOrigin;
  private Point againOrigin;

  @Before
  public void generate() {
    origin = new Point(0.0, 0.0);
    endX = new Point(10.0, 0.0);
    endY = new Point(0.0, 10.0);
    newOrigin = new Point(0.0, 0.0);
    againOrigin = new Point(0.0, 0.0);
  }

  @Test
  public void testPoint() {
    Assert.assertNotEquals(origin, endX);
    Assert.assertNotEquals(endX, endY);
    Assert.assertNotEquals(endY, origin);

    // 1. 自反性
    Assert.assertEquals(origin, origin);

    // 2. 对称性
    Assert.assertEquals(newOrigin, origin);
    Assert.assertEquals(origin, newOrigin);

    // 3. 传递性
    Assert.assertEquals(origin, newOrigin);
    Assert.assertEquals(newOrigin, againOrigin);
    Assert.assertEquals(againOrigin, origin);

    // 4. 一致性
    Assert.assertEquals(newOrigin, againOrigin);

    // 5. null返回false
    Assert.assertNotEquals(origin, null);

    // 以上是针对同一个类的对象，看起来似乎完全符合规则，那么接下来试着测试子类的情况
  }

  @Test
  public void testCirclePoint() {
    CirclePoint circlePoint = new CirclePoint(0.0, 0.0, 1.0);

    // 这就违反了对称性
    //Assert.assertEquals(origin, circlePoint);
    //Assert.assertNotEquals(circlePoint, origin);

    origin = new CirclePoint(0.0, 0.0, 1.0);
    // 然后修改为核心技术里面的方式，竟然通过了验证
    Assert.assertEquals(origin, circlePoint);
    Assert.assertEquals(circlePoint, origin);

    // 事实上两种做法都可以，后面这一种比较严格，适用于子类相对而言比较独立的情况
    // 前面这一种则不关心后续的扩展，那么应该将equals方法标记为final
  }
}

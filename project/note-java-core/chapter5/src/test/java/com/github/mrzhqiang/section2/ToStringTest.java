package com.github.mrzhqiang.section2;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import org.junit.Test;

public class ToStringTest {

  @Test
  public void testPoint() {
    System.out.println(new Point(1.0, 0.1));
  }

  @Test
  public void testCirclePoint() {
    System.out.println(new CirclePoint(5.0, 5.0, 5));
  }

  @Test
  public void testLine() {
    Point p1 = new Point(1.0, 2.0);
    Point p2 = new Point(1.5, 2.5);
    System.out.println(new Line(p1, p2));
  }

  @Test
  public void testList() {
    ArrayList<Point> points =
        Lists.newArrayList(new Point(1.0, 2.0), new Point(1.0, 2.0), new Point(1.0, 2.0));
    System.out.println(points);
    // ArrayList 可以设置初始容量，这是一个阈值，数组的实际空间大小可能更大
    // add时会检测一下，如果超出实际数组的长度，则进行容量的扩增并拷贝数组元素进去
    // ensureCapacity可以设置预期的容量，此时将
    // size表示实际的元素个数
    // trimToSize表示将
  }
}

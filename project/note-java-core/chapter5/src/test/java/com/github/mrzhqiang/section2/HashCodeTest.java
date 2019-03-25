package com.github.mrzhqiang.section2;

import java.util.HashMap;
import org.junit.Test;

public class HashCodeTest {

  @Test
  public void testHashValue() {
    System.out.println(new Point(1.2, 2.3).hashCode());
    System.out.println(new Point(1.2, 2.3).hashCode());
    System.out.println(new CirclePoint(1.2, 2.3, 5.0).hashCode());
  }

  @Test
  public void testHashMap() {
    HashMap<Point, Double> map = new HashMap<>();
    map.put(new Point(1.0, 1.0), 1.0 * 1.0);
    map.put(new Point(1.1, 1.1), 1.1 * 1.1);
    map.put(new Point(1.2, 1.2), 1.2 * 1.2);
    map.put(new Point(1.0, 1.0), 100.0);
    System.out.println(map);
  }
}

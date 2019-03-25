package com.github.mrzhqiang.section2;

import java.util.Objects;

public class CirclePoint extends Point {

  public double radius;

  public CirclePoint(double x, double y) {
    super(x, y);
  }

  public CirclePoint(double x, double y, double radius) {
    super(x, y);
    this.radius = radius;
  }

  @Override public double position() {
    return super.position() + radius;
  }

  @Override public int hashCode() {
    // 有一个原则就是，equals使用了哪些属性，则hashCode只针对这些属性进行hash
    return Objects.hash(super.hashCode(), radius);
  }

  @Override public boolean equals(Object obj) {
    if (!super.equals(obj)) {
      return false;
    }

    CirclePoint other = (CirclePoint) obj;
    return radius == other.radius;
  }

  @Override public String toString() {
    // 由于当前类扩展了Point，因此需要使用baseToString方法
    return baseToString().add("radius", radius).toString();
  }
}

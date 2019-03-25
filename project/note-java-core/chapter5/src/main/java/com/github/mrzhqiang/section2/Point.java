package com.github.mrzhqiang.section2;

import com.google.common.base.MoreObjects;
import java.util.Arrays;
import java.util.Objects;

public class Point {

  public final double x;
  public final double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double position() {
    return Math.hypot(x, y);
  }

  public final double[] asList() {
    return new double[] {x, y};
  }

  public final Point newOf(double[] xy) {
    if (xy == null || xy.length != 2) {
      throw new IllegalArgumentException("xy: " + Arrays.toString(xy));
    }
    return new Point(xy[0], xy[1]);
  }

  @Override public int hashCode() {
    return Objects.hash(x, y);
  }

  @Override public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null || obj.getClass() != getClass()) {
      return false;
    }

    Point other = (Point) obj;
    return x == other.x
        && y == other.y;
  }

  protected MoreObjects.ToStringHelper baseToString() {
    return MoreObjects.toStringHelper(this)
        .add("x", x)
        .add("y", y);
  }

  @Override public String toString() {
    return baseToString().toString();
  }
}

package com.github.mrzhqiang.section2;

import com.google.common.base.MoreObjects;
import java.util.Objects;

public class Line {

  public Point startPoint;
  public Point endPoint;

  public Line(Point startPoint, Point endPoint) {
    this.startPoint = startPoint;
    this.endPoint = endPoint;
  }

  @Override public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (!(obj instanceof Line)) {
      return false;
    }

    Line other = (Line) obj;
    return Objects.equals(startPoint, other.startPoint)
        && Objects.equals(endPoint, other.endPoint);
  }

  @Override public String toString() {
    // 没有扩展类的时候，不值得实现SimpleToString接口
    return MoreObjects.toStringHelper(this)
        .add("startPoint", startPoint)
        .add("endPoint", endPoint)
        .toString();
  }
}

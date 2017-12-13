package com.github.youkuanzeng.java8example2;

import java.awt.Point;

public class GPSCar extends Car implements GPS {
	public Point getLocation() {
		Point point = new Point();
		point.setLocation(super.getSpeed(), super.getSpeed());
		return point;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("£¬×ø±ê£º(" + getLocation().x + "," + getLocation().y + ")");
		return sb.toString();
	}
}

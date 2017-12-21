package com.github.youkuanzeng.java8example_2;

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
		sb.append("�����꣺(" + getLocation().x + "," + getLocation().y + ")");
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Car car = new GPSCar();
		car.setName("��ɯ����");
		car.setSpeed(212.11);
		System.out.println(car);
	}
}

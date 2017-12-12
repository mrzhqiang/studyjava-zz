package com.github.youkuanzeng.rectangle;

public class Rectangle {
	double length;
	double brief;
	public Rectangle() {
		length  = 1;
		brief = 2;
	}
	public Rectangle(double length, double brief) {
		this.length = length;
		this.brief = brief;
	}
	public double getArea() {
		return length*brief;
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println(r1.getArea());
		Rectangle r2 = new Rectangle(100, 1000);
		System.out.println(r2.getArea());
	}
}

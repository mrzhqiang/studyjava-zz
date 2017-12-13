package com.github.youkuanzeng.java8example_5;

public class Test {
	public static void main(String[] args) {
		Circle circle = new Circle(1);
		System.out.println("图形的名称是：" + circle.getName());
		System.out.println("图形的面积是：" + circle.getArea());
		Rectangle rectangle = new Rectangle(1, 1);
		System.out.println("图形的名称是：" + rectangle.getName());
		System.out.println("图形的面积是：" + rectangle.getArea());
	}
}

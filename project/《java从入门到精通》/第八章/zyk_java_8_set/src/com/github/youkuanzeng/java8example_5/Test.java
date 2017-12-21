package com.github.youkuanzeng.java8example_5;

public class Test {
	public static void main(String[] args) {
		Shape circle = new Circle(10);
		System.out.println("图形的名称是：" + circle.getName());
		System.out.println("图形的面积是：" + circle.getArea());
		Shape rectangle = new Rectangle(10, 1);
		System.out.println("图形的名称是：" + rectangle.getName());
		System.out.println("图形的面积是：" + rectangle.getArea());
	}
}

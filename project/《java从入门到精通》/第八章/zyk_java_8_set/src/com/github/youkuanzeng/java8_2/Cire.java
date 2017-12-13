package com.github.youkuanzeng.java8_2;

public class Cire implements ICalculate {
	public float getArea(float r) {
		float area = PI * r * r;
		return area;
	}

	public float getCircumference(float r) {
		float circumference = 2 * PI * r;
		return circumference;
	}
	public static void main(String[] args) {
		//System.out.println(args);
	}
}

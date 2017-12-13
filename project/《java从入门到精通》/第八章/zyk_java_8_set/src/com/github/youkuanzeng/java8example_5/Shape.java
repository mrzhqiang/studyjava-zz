package com.github.youkuanzeng.java8example_5;

public abstract class Shape {
	public String getName() {
		return this.getClass().getSimpleName();
	}

	public abstract double getArea();
}

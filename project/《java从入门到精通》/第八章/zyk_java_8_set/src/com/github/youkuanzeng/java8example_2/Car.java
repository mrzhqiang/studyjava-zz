package com.github.youkuanzeng.java8example_2;

public class Car {
	private String name;
	private double speed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getSpeed() {
		return speed;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("������" + name + ",");
		sb.append("�ٶ� ��" + speed + "km/h");
		return sb.toString();
	}
}

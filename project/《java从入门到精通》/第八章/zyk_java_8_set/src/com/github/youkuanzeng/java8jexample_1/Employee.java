package com.github.youkuanzeng.java8jexample_1;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int age;

	private Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Employee o) {
		if (id > o.id) {
			return 1;
		} else if (id < o.id) {
			return -1;
		}
		return 0;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("员工 的编号：" + id + "，");
		sb.append("员工 的姓名：" + name + "，");
		sb.append("员工 的年龄：" + age);
		return sb.toString();
	}
	/*public static void main(String[] args) {
		System.out.println(sb);
	}*/
}

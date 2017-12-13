package com.github.youkuanzeng.java8_4;

public class Zoo {

	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println("执行 dog.cry();语句时的输出结果");
		dog.cry();
		Cat cat = new Cat();
		System.out.println("执行 cat.cry();语句时的输出结果");
		cat.cry();
		Sheep sheep = new Sheep();
		System.out.println("执行 sheep.cry();语句时的输出结果");
		sheep.cry();
	}
}

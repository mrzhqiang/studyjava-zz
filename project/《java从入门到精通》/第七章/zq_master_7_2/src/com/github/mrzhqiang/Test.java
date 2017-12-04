package com.github.mrzhqiang;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human human = new Human();
		human.setName("zyk");
		human.age = 18;
		human.sex = "male";

		Human human1 = new Human("zyk1", 36);
		human1.setName("new zyk");
		human1.setAge(37);
		human1.setSex("female");

		Human.show(human);
		Human.show(human1);
		
//		Test.show(human1);
	}

	static void show(Object obj) {
		System.out.println(obj);
	}
}

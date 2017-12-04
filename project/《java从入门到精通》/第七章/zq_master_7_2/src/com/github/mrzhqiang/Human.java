package com.github.mrzhqiang;

public class Human {
	
	private String name;// 只能被类所用，类中的所有事物，都可以访问，但是不能被类之外的访问
	int age;
	String sex;

	// 无参构造方法，当没有有参构造方法存在的时候，这是默认的行为，将不需要手动写出来
	public Human() {
//		name = null;
//		age = 0;
//		sex = null;
		
		String name = "zzz";// 局部变量在方法结束的时候，就没有用了
//		this.name = "zyk";// 使用this可以访问类的成员变量
	}

	// 有参构造方法1
	public Human(String name) {
		this.name = name;
		// ...其他初始化的事情
	}
	
	// 有参构造方法2
	public Human(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name+"111";
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public static void show(Human human) {
		System.out.println(human.name);
		System.out.println(human.age);
		System.out.println(human.sex);
	}
}

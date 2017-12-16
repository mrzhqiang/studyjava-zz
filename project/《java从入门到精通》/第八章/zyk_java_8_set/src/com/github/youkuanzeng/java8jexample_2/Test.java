package com.github.youkuanzeng.java8jexample_2;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		Class<?> clazz = student.getClass();
		System.out.println("类的标准名称：" + clazz.getCanonicalName());
		try {
			Field id = clazz.getDeclaredField("id");
			System.out.println("设置前的id:" + student.getId());
			id.setAccessible(true);
			id.setInt(student, 10);
			System.out.println("设置后的id:" + student.getId());

			Field name = clazz.getDeclaredField("name");
			System.out.println("设置前的name:" + student.getName());
			name.setAccessible(true);
			name.set(student, "youkuanzeng");
			System.out.println("设置后的name:" + student.getName());

			Field male = clazz.getDeclaredField("male");
			System.out.println("设置前的male:" + student.isMale());
			male.setAccessible(true);
			male.setBoolean(student, true);
			System.out.println("设置后的male:" + student.isMale());

			Field account = clazz.getDeclaredField("account");
			System.out.println("设置前的account:" + student.getAccount());
			account.setAccessible(true);
			account.setDouble(student, 12.34);
			System.out.println("设置后的account:" + student.getAccount());
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}

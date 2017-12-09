package com.github.youkuanzeng.single;

public class Test {
	public static void main(String[] args) {
		System.out.println("洪兴老大：");
		Emperor emperor1 = Emperor.getInstance();
		emperor1.getName();
		System.out.println("红星老大：");
		Emperor emperor2 = Emperor.getInstance();
		emperor2.getName();
	}
}

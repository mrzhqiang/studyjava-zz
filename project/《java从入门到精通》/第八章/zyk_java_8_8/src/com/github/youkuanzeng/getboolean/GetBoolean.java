package com.github.youkuanzeng.getboolean;

public class GetBoolean {
	public static void main(String[] args) {
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("ok");
		System.out.println("b1:" + b1.booleanValue());
		System.out.println("b2:" + b2.booleanValue());
	}
}

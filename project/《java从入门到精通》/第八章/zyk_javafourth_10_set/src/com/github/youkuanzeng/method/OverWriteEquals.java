package com.github.youkuanzeng.method;

class V{
}

public class OverWriteEquals {
	public static void main(String[] args) {
		String s1 = "123";
		String s2 = "123";
		System.out.println(s1.equals(s2));
		V v1 = new V();
		V v2 = new V();
		System.out.println(v1.equals(v2));
	}
}

package com.github.youkuanzeng.summation;

public class Summation {

	public static void main(String[] args) {
		String str[] = {"89","12","10","18","35"};
		int sum = 0;
		for(int i = 0; i < str.length; i++) {
			int myint = Integer.parseInt(str[i]);
			sum = sum + myint;
		}
		System.out.println("数组中的各元素之和是：" + sum);
	}
}

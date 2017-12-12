package com.github.youkuanzeng.single;

public class Emperor {
	
	private static Emperor emperor = null;
	
	private Emperor() {
	}
	
	// 懒汉式单例模式，不错哟
	public static Emperor getInstance() {
		if(emperor == null) {
			emperor = new Emperor();
		}
		return emperor;
	}
	
	public void showName() {
		System.out.println("某大大");
	}
}

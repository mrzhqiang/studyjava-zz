package com.github.youkuanzeng.single;

public class Emperor {
	private static Emperor emperor = null;
	private Emperor() {
	}
	public static Emperor getInstance() {
		if(emperor == null) {
			emperor = new Emperor();
		}
		return emperor;
	}
	public void getName() {
		System.out.println("Ä³´ó´ó");
	}
}

package com.github.youkuanzeng.java8_5;

public class Tiger extends Beast {
	public Tiger() {
		super("����");
		super.skin = "����";
		super.move();
	}
	
	public static void main(String[] args) {
		new Beast("�ٻ�֮��").move();
		new Tiger();
	}
}

package com.github.youkuanzeng.java8_5;

public class Tiger extends Beast {
	public Tiger() {
		super("条纹");
		super.skin = "条纹";
		super.move();
	}
	
	public static void main(String[] args) {
		new Beast("蒂花之秀").move();
		new Tiger();
	}
}

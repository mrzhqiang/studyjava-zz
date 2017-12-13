package com.github.youkuanzeng.java8_6;

public class Calculate {
	final float PI = 3.14159f;
	public float getArea(float r) {
		float area = PI * r * r;
		return area;
	}
	
	public float getArea(float l,float w) {
		float area = l*w;
		return area;
	}
	
	public void draw(int num) {
		System.out.println("画" +num+ "个任意形状的图形");
	}
	
	public void draw(String shape) {
		System.out.println("画一个" +shape );
	}
	
	public static void main(String[] args) {
		Calculate calculate = new Calculate();
		float l = 20;
		float w= 30;
		float areaRectangle = calculate.getArea(l , w);
		System.out.println("求长为“+l+” 宽为“+w+”的矩形的面积是：" +areaRectangle);
		float r= 7;
		float areaCire = calculate.getArea(r);
		System.out.println("求半径为“+r+”的园形的面积是：" +areaCire);
		int num = 7;
		calculate.draw(num);
		calculate.draw("三角形");
	}

}

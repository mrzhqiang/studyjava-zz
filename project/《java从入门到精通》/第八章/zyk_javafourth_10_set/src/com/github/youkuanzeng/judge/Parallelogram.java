package com.github.youkuanzeng.judge;

public class Parallelogram extends  Quadrangle {
	public static void main(String args[]) {
		Quadrangle q = new Quadrangle();
		if(q instanceof Parallelogram) {
			Parallelogram p = (Parallelogram)q;
		}
		if(q instanceof Square) {
			Square s = (Square)q;
		}
		//System.out.println(q instanceof Anything);
	}
}

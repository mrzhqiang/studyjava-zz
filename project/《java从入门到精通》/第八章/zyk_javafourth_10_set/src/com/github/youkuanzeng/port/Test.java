package com.github.youkuanzeng.port;

public class Test {
	public static void main(String[] args) {
		IdarwTest[] d = { (IdarwTest) new SquareUseInterface(), (IdarwTest) new ParallelogramgleUseInterface() };
		for (int i = 0; i < d.length; i++) {
			d[i].draw();
		}
	}
}

package com.github.youkuanzeng.inherit;

class Test2 extends Test1 {
	public Test2() {
		super();
		super.doSomething();
	}

	public void doSomethingnew() {

	}

	public void doSomething() {

	}

	protected Test2 doIt() {
		return new Test2();
	}
}

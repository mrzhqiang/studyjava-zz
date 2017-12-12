package zyk_vehicle;

public abstract class Vehicle {
	public String body;
	public String direction;
	public String wheelState;

	// 这里纠正一下，驾驶是人的操作，应该是一个驾驶的接口，而不是抽象类。后面学到接口就能明白了。
	public abstract String driving(String direction, String wheelState);
}

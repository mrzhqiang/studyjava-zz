package zyk_vehicle;

public abstract class Vehicle {
	public String body;
	public String direction;
	public String wheelState;
	public abstract String driving(String direction, String wheelState);
}

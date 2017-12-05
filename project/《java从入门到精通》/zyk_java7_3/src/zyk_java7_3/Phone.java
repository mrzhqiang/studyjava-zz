package zyk_java7_3;

public class Phone {
	private int price;
	private String name;
	private String category;
public String getName() {
	int price = 2000;
	setName("Java");
	return price + this.name;
}
private void setName(String name) {
	this.name = name;
}
public Phone getPhone() {
	return  this;
}
}

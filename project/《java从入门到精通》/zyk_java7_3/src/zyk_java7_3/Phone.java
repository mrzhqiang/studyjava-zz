
  package zyk_java7_3;

public class Phone {
	// FIXME 成员属性将永远不被使用，此处应该“用”一下，比如，创建get/set方法，或是在其他方法中，使用price
	private int price;
	private String name;
	// FIXME 与price同样的问题
	private String category;
	public String getName(int price ) {
	// 注意，如果这里应该使用成员变量，而不是局部变量，否则你书的所有价格，将永远是固定值，而不是初始定价
		this.price = price;
		setName("Java");
		return price + this.name;
		}
	public void setName(String name) {
		this.name = name;
		}
	public Phone getPhone() {
		return  this;
		}
	public static void main(String [] args) {
	}
}

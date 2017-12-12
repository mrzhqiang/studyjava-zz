
package zyk_java7_3;

public class Phone {
	private int price;
	private String name;
	private String category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Phone getPhone() {
		return this;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.setName("java");
		phone.setPrice(10);
		// get是属于访问器，set是属于修改器
		System.out.println(phone.getName());
	}

}

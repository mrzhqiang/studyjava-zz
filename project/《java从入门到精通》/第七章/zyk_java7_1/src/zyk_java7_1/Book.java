package zyk_java7_1;

public class Book {
	private String name;

	public String getname() {
		int id = 0;
		setName("Java");
		return id + this.name;
	}

	// set方法没必要私有化，而应该提供给外部使用，所以应该是一个public
	public void setName(String name) {
		this.name = name;
	}

	public Book getBook() {
		return this;
	}
}

package zyk_java7practice1;

public class Practice1 {
	private String name;
	// FIXME 私有的set方法，并且存在无意义的变量名。很多情况下，这不是儿戏，而是一种职业素养，请严格遵守
	private void setName(String zhazha) {
		this.name = zhazha;
	}
	public String getName() {
		return name;
	}
}

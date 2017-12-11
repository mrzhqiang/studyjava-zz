package zyk_java7_4;

public class Zyk_java7_4 {
	private int name;
	public int getName() {
		int id=0;
		setName("Java");
		// NOTE：没有局部变量冲突的情况下，通常的“this”可以省略
		return id+this.name;
	}
	// FIXME 私有的set方法
	private void setName(String string) {
		// FIXME 空的方法体
	}
	// TODO main
}

package zq_master_8_6_3;

public class Parent {
	
	public int a;

	public Parent() {
		this(10);
		System.out.println("父类的无参构造方法被调用");
	}
	
	public Parent(int a) {
		this.a = a;
		System.out.println("父类的有参构造方法被调用");
	}
	
	public int getInt() {
		return a;
	}
}

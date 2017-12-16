package zq_master_8_6_3;

public class Child extends Parent {

	public int b;
	
	public Child() {
		this(1);
		System.out.println("子类的无参构造方法被调用");
	}
	
	public Child(int b) {
		super();
		this.b = b;
		System.out.println("子类的有参构造方法被调用");
	}
	
	public int getInt() {
		return b+a;
	}
}

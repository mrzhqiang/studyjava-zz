package zyk_java7_1;

public class AnyThting {
	
	public AnyThting() {
		this("this 调用有参构造方法");
		System.out.println("无参构造方法");
	}

	public AnyThting(String name) {
		System.err.println(name);
		System.out.println("有参构造方法");
	}
	
	public static void main(String[] args) {
		// this 调用有参构造方法
		// 有参构造方法
		// 无参构造方法
		new AnyThting();
		
		// mrzhqiang
		// 有参构造方法
		new AnyThting("mrzhqiang");
	}
}

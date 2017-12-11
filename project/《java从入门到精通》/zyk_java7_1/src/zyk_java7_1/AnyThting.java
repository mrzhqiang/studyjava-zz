package zyk_java7_1;

public class AnyThting {
	public AnyThting() {
		this("this 调用有参构造方法");
		System.out.println("无参构造方法");
		}
	public AnyThting(String name) {
	// FIXME 带参数的方法要有意义（name要被使用），否则建立出来做什么呢？
	
	// FIXME 格式排版问题
		System.out.println("有参构造方法");}

	// TODO 如果整个工程都没有main方法，那么就应该在内部建立一个main方法来测试
	// PS：尽管例子中没有，但是，要建立这样的意识。怀疑一切并验证一切。
}

package zyk_java7_5;

public class StaticTest {
	static double PI = 3.1415;
	static int id;

	public static void method1() {
		// FIXME 空的静态方法
	}

	// FIXME 格式
	public void method2() {
		System.out.println(StaticTest.PI);
		System.out.println(StaticTest.id);
		StaticTest.method1();
	}
	// TODO main
}

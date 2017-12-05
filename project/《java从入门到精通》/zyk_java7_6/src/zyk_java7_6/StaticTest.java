package zyk_java7_6;

public class StaticTest {
	static double PI = 3.1415;
	static int id;
	public static void method1() {
		
	}
public void method2() {
	System.out.println(StaticTest.PI);
	System.out.println(StaticTest.id);
	StaticTest.method1();
}
//在静态方法中不可以使this关键字
//在静态方法中不可以直接调用非静态方法
/*public static StaticTest method3() {
	method2();
	return this;
}*/
}

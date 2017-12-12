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

// 解答：静态属于类，其他的属于对象；类是载体，对象是实例。this代表对象，所以不能使用
// 解答：调用非静态方法时，实际上用的是this去调用，所以也不能被直接调用

//在静态方法中不可以使this关键字
//在静态方法中不可以直接调用非静态方法
/*public static StaticTest method3() {
	method2();
	return this;
}*/

	// TODO main
}

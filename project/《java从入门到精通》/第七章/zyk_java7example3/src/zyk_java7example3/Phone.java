package zyk_java7example3;

public class Phone {
	private static int counter = 0;
	public Phone(String title) {
		System.out.println("售出手机：" + title);
		counter++;
	}
	public static int getCounter() {
		return counter;
	}
}

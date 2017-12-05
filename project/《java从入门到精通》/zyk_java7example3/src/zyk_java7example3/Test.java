package zyk_java7example3;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		String[]titles = {"iphone","huawei","mi"};
		for(int i = 0; i < 5; i++) {
			new Phone(titles[new Random().nextInt(3)]);
		}
		System.out.println("总计销售了" + Phone.getCounter()+"部手机！");
	}
}

package zyk_java7example3;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		// FIXME 格式，变量名titles和类型String中间要有一个空格，不能写在一起
		String[] titles = {"iphone","huawei","mi"};
		for(int i = 0; i < 5; i++) {
			// NOTE：如果只是想进行销售的操作，建议针对Phone建立一个销售的方法，而不是new对象却从不使用它们
			new Phone(titles[new Random().nextInt(3)]);
		}
		System.out.println("总计销售了" + Phone.getCounter()+"部手机！");
	}
}

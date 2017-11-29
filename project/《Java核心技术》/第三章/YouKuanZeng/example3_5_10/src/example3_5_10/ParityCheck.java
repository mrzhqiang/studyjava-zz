package example3_5_10;

import java.util.Scanner;

public class ParityCheck {
	public static void main(String[] args) {
		Scanner mrzq = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		long number = mrzq.nextLong();
		String check = (number%2 == 0)?"这个数字式：偶数":"这个数字是:奇数";
		System.out.println(check);
	}
}

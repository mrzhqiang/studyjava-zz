package example3_5_10;

import java.util.Scanner;

public class ParityCheck {
	public static void main(String[] args) {
		Scanner mrzq = new Scanner(System.in);
		System.out.println("������һ������:");
		long number = mrzq.nextLong();
		String check = (number%2 == 0)?"�������ʽ��ż��":"���������:����";
		System.out.println(check);
	}
}
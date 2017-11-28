package task_3_summary;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("请选择要执行的运算类型：");
			System.out.println("1.加法");
			System.out.println("2.减法");
			System.out.println("3.乘法");
			System.out.println("4.除法");
			System.out.println("5.退出");
			int type = in.nextInt();
			 if(type==5) {
					break;
			}
			System.out.println("请输入第一个整数：");
			int a = in.nextInt();
			System.out.println("请输入第二个整数：");
			int b = in.nextInt();
			if (type==1) {
				System.out.println(a+"+"+b+"="+(a+b));
			} else if(type == 2) {
				System.out.println(a+"-"+b+"="+(a-b));
			}else if(type==3) {
				System.out.println(a+"*"+b+"="+(a*b));
			} else if(type==4) {
				System.out.println(a+"/"+b+"="+(a/b));
			}
		}
		in.close();
	}

}

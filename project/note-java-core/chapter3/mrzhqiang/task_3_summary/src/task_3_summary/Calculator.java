package task_3_summary;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("��ѡ��Ҫִ�е��������ͣ�");
			System.out.println("1.�ӷ�");
			System.out.println("2.����");
			System.out.println("3.�˷�");
			System.out.println("4.����");
			System.out.println("5.�˳�");
			int type = in.nextInt();
			 if(type==5) {
					break;
			}
			System.out.println("�������һ��������");
			int a = in.nextInt();
			System.out.println("������ڶ���������");
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
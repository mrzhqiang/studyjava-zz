package corejava3_8;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3.8.2 �������
		/*long a = 11L;
		if (a!=Long.valueOf("12")) { 
			show("a������b");
			// ʹ�û����ţ���������������������Ҫ�ж�������Ч���Ż�ͬʱִ��
			// ������Ǹ���ִ��
			show("����");
		}*/
		
		// else
		/*String one = "11";
		if (!one.equals("22")) {
			show("11������22");
		} else if (one.equals("1")){
			show("11����1");
		} else {
			show("11�Ǹ���");
		}*/
		
		// �ж�2>a>0
		/*if(a>0 && a<2) {
			show("2>a>0");
		}*/
		
		// 3.8.3 ѭ��
		Scanner in = new Scanner(System.in);
		/*show("������esc��ɳ���");
		one = in.nextLine();
		while (!one.equals("esc")) {
			show(one);
			show("������esc��ɳ���");
			one = in.nextLine();
		}*/
		/*do {
			show("������esc��ɳ���");
			one = in.nextLine();
		} while(!one.equals("esc"));*/
		
		// 3.8.4 ȷ��ѭ��
		// ��while
		/*int index = 0;// ��һ��
		String str = "";
		while(index < 100) {// �ڶ���
			str = str + index + "_";
			index ++;// ������
		}
		show(str);*/
		
		// �ϳ�����
		/*String str1 = "";
		for (int i = 0; i < 100; i++) {
			str1 = str1 + i + "_";
		}
		show(str1);*/
		
		// 3.8.5 ����ѡ��switch���
		show("��ѡ��һ����Ŀ��");
		show("1.LOL");
		show("2.�Լ�");
		show("3.����");
		String item = in.nextLine();
		switch(item) {
		case "1":
			show("��ӭ�����ٻ�ʦϿ��");
			break;
		case "2":
			show("��ӭ�������ص�");
			break;
		case "3":
			show("��ӭ����Bbox");
			break;
		}
		show("���");
	}
	
	public static void show(Object ob) {
		System.out.println(ob);
	}

}
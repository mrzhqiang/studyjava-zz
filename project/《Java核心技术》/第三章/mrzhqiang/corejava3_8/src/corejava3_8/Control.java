package corejava3_8;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3.8.2 条件语句
		/*long a = 11L;
		if (a!=Long.valueOf("12")) { 
			show("a不等于b");
			// 使用花括号，即块语句包括起来，则需要判断条件生效，才会同时执行
			// 否则就是各自执行
			show("结束");
		}*/
		
		// else
		/*String one = "11";
		if (!one.equals("22")) {
			show("11不等于22");
		} else if (one.equals("1")){
			show("11等于1");
		} else {
			show("11是个鬼");
		}*/
		
		// 判断2>a>0
		/*if(a>0 && a<2) {
			show("2>a>0");
		}*/
		
		// 3.8.3 循环
		Scanner in = new Scanner(System.in);
		/*show("请输入esc完成程序：");
		one = in.nextLine();
		while (!one.equals("esc")) {
			show(one);
			show("请输入esc完成程序：");
			one = in.nextLine();
		}*/
		/*do {
			show("请输入esc完成程序：");
			one = in.nextLine();
		} while(!one.equals("esc"));*/
		
		// 3.8.4 确定循环
		// 用while
		/*int index = 0;// 第一步
		String str = "";
		while(index < 100) {// 第二步
			str = str + index + "_";
			index ++;// 第三步
		}
		show(str);*/
		
		// 合成三步
		/*String str1 = "";
		for (int i = 0; i < 100; i++) {
			str1 = str1 + i + "_";
		}
		show(str1);*/
		
		// 3.8.5 多重选择：switch语句
		show("请选择一个项目：");
		show("1.LOL");
		show("2.吃鸡");
		show("3.单机");
		String item = in.nextLine();
		switch(item) {
		case "1":
			show("欢迎来到召唤师峡谷");
			break;
		case "2":
			show("欢迎来到绝地岛");
			break;
		case "3":
			show("欢迎来到Bbox");
			break;
		}
		show("完成");
	}
	
	public static void show(Object ob) {
		System.out.println(ob);
	}

}

package zyk_java7example2;

import java.util.Scanner;

public class CelsiusConverter {
	public double getFahrenheit(double celsius) {
		double fahrenheit = 1.8*celsius + 32;
		return fahrenheit;
		}
	
// FIXME 格式：事实上，强调这么多次，还是“我行我素”的话，真的不是“不知道”的问题，而是“态度问题”。
// 随便一个回车就有了起始点，这是Eclipse自动完成的
// 再说了，书上的例子，我创建的工程，哪里是这样的写法？难道就没有一点疑惑吗？
// 为什么要强调格式？笔试的时候，管你写得再好，这样的格式问题，直接pass掉你。这是最基本的素质。
	// 这是最基本的素质。
	// 连复制粘贴都自动完成了格式，你还能写出来一个奇怪的缩进，真是了不起
	public static void main(String[] args) {
		System.out.println("请输入要转换的温度（单位：摄氏度）");
		Scanner in = new Scanner(System.in);
		double celsius = in.nextDouble();
		CelsiusConverter converter = new CelsiusConverter();
		double fahrenheit =  converter.getFahrenheit(celsius);
		System.out.println("转换完成的温度（单位：华氏度）：" + fahrenheit);
		}
	}

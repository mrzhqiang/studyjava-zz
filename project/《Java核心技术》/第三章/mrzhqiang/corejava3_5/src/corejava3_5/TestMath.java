package corejava3_5;

public class TestMath {
	public static void main(String[] args) {
		double x = 4;
		System.out.println(x);
		// 平方根
		double y = Math.sqrt(x);
		System.out.println(y); // prints 2.0
		
		// 平方
		x = x * x;
		System.out.println(x);
		
		int a = 3;
		// 幂运算。是指：x的a次方吗？如果x打印为16的3次方，那么pow就是x的a次方！
		y = Math.pow(x,a);
		System.out.println(y);
		// 既然Math类有幂运算方法，那么平方应该更简单
		System.out.println(Math.pow(x, 2));
		
		/*Math类的三角函数*/
		// 猜测传递参数为30度，那么结果会是1/2
		System.out.println(Math.sin(30));
		// 上面错了，那么应该是需要一个弧度，找到Math类中的角度转换弧度方法
		System.out.println(Math.sin(Math.toRadians(30)));
		// 30度对应的弧度
		System.out.println(Math.toRadians(30));
		
		// 比较int类型与float类型的最大值
		int m = Integer.MAX_VALUE;
		float f = Float.MAX_VALUE;
		System.out.println(m > f);
		// 看一看float最大值
		System.out.println(f);
		
		// int类型转换为float类型为什么损失一定的精度？
		int n = 123456789;
		float adasdasdasd = n;
		double aaa = n;
		System.out.println(adasdasdasd);
		System.out.println(aaa);
		// 为什么会损失精度？因为它们都是4字节的存储空间，一旦int类型数值超过2的24次方，
		// 就会影响float类型的存储空间，导致float类型丢失精度
		
		double mN = 9.979797;
		int nx = (int)mN;
		System.out.println(nx);
		System.out.println(mN);
		
		// ++ 前缀与后缀的区别
		int a1 = 10;
		int b1 = 5;
		// 后缀++
		b1 = a1++; // >>> 首先 完成 b1 = a1 接着a1=a1+1;
		System.out.println(a1);
		System.out.println(b1);
		// ++前缀
		b1 = ++a1; // >>> 首先完成 a1=a1+1 接着 b1 = 1a;
		System.out.println(a1);
		System.out.println(b1);
		
		// 逻辑 与 或 非
		// 短路与 && and
		int i = 1;
		if(1==i++/*true*/ && i==2/*true*/) {
			System.out.println("与逻辑检测通过");
		}
		// 短路或 || or
		if(1==2||2==2||3==3) {
			System.out.println("或逻辑检测通过");
		} else {
			System.out.println("或逻辑检测不通过");
		}
		// 三元运算符
		int sanyuan = 1;
		sanyuan = 1==2||2==2||3==3?1:2;
		// 非
		if(!false) {
			System.out.println("");
		}
		
		String greeting = "Hello" ;
		String s = greeting.substring(0,3);// (0,3] 0是指下标为0，3是指结束下标，但不包括
		System.out.println(s);
		
		if("Hello"==greeting) {
			System.out.println("sdfsdfsdfsdfsdasdasdasdasd");
		}

		if(greeting.equals("hello")) {
//			System.out.println("sdfsdfsdfsdfsdasdasdasdasd");
		}
		
		// 50多个API String的方法
		
	}

}

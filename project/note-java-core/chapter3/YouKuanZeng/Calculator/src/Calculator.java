import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input;
	do {
	while(true) {
				System.out.println("请选择运算类型");
				System.out.println("1.+");
				System.out.println("2.-");
				System.out.println("3.*");
				System.out.println("4./");
				System.out.println("5.结束");
	int type = in.nextInt();
			if(type == 1) {
				System.out.println("请输入待输整数：");
			int a = in.nextInt();
				System.out.println("请输入待输整数：");	
			int b = in.nextInt();
				System.out.println(+(a+b));
	}else if(type == 2) {
			System.out.println("请输入待输整数：");
		int a = in.nextInt();
			System.out.println("请输入待输整数：");	
		int b = in.nextInt();
			System.out.println(+(a-b));
	} else if(type == 3){
			System.out.println("请输入待输整数：");
		int a = in.nextInt();
			System.out.println("请输入待输整数：");	
		int b = in.nextInt();
			System.out.println(+(a*b));
	}else if(type == 4){
			System.out.println("请输入待输整数：");
		int a = in.nextInt();
			System.out.println("请输入待输整数：");	
		int b = in.nextInt();
			System.out.println(+(a/b));
	}	else if(type == 5) {
		break;
	}	
	}
			System.out.println("不再计算?(Y/N)");
			input = in.next();
			}
		while(input.equals("N"));
		//下面进行优化(革命尚未成功)
		/*String input;
		do {
			while(true) {
				System.out.println("请选择运算类型");
				System.out.println("1.+,2.-,3.*,4./,5.结束" );
			int type = in.nextInt();
	System.out.println("请输入待输整数：");
			int a = in.nextInt();
	System.out.println("请输入待输整数：");	
			int b = in.nextInt();
	if(type == 1) {System.out.println(+(a+b));
	if(type == 2) {System.out.println(+(a-b));
	}else if(type == 3){System.out.println(+(a*b));
	}else if(type == 4){	System.out.println(+(a/b));
	}else if(type == 5)
	{break;	
	}
	}
	}
			System.out.println("不再计算?(Y/N)");
			input = in.next();
	}
			while(input.equals("N"));*/
	}
}
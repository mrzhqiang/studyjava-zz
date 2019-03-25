import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class InOut {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 3.7.1 读取输入
		Scanner in = new Scanner(System.in);
		// 能读取空格，并且需要回车结束
//		String nnn = in.nextLine();
//		System.out.println(nnn);
		// next的名字与newLine名字不一样，是否存在区别？
		// 以空格作为分隔，获得键盘输入的第一个字符串
		// 作为分隔的意思是，遇到空格符号，就终止了它的读取
//		String word = in.next();
//		System.out.println(word);
		
		// 我对Scanner很好奇，想看看它是什么
//		System.out.println(in);
		
//		float zhengshu = in.nextFloat();
//		show(zhengshu);
		
		// 3.7.2 格式化输出是美化显示格式的，可以略看。
		
		// 3.7.3 文件输入与输出
//		Scanner in1 = new Scanner(Paths.get("myfile.txt"), "UTF-8");
//		String content = in1.nextLine();
//		show(content);
		
		PrintWriter out = new PrintWriter("myfile.txt", "UTF-8");
		out.println("zyk");
		// 冲洗，是为了保存“zyk”这个内容
		out.flush();
		// 关闭，是为了关闭资源，让硬件舒服一点
		out.close();
		System.out.println("结束");
		
	}
	
	public static void show(Object ob) {
		System.out.println(ob);
	}

}

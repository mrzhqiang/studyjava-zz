import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class InOut {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 3.7.1 ��ȡ����
		Scanner in = new Scanner(System.in);
		// �ܶ�ȡ�ո񣬲�����Ҫ�س�����
//		String nnn = in.nextLine();
//		System.out.println(nnn);
		// next��������newLine���ֲ�һ�����Ƿ��������
		// �Կո���Ϊ�ָ�����ü�������ĵ�һ���ַ���
		// ��Ϊ�ָ�����˼�ǣ������ո���ţ�����ֹ�����Ķ�ȡ
//		String word = in.next();
//		System.out.println(word);
		
		// �Ҷ�Scanner�ܺ��棬�뿴������ʲô
//		System.out.println(in);
		
//		float zhengshu = in.nextFloat();
//		show(zhengshu);
		
		// 3.7.2 ��ʽ�������������ʾ��ʽ�ģ������Կ���
		
		// 3.7.3 �ļ����������
//		Scanner in1 = new Scanner(Paths.get("myfile.txt"), "UTF-8");
//		String content = in1.nextLine();
//		show(content);
		
		PrintWriter out = new PrintWriter("myfile.txt", "UTF-8");
		out.println("zyk");
		// ��ϴ����Ϊ�˱��桰zyk���������
		out.flush();
		// �رգ���Ϊ�˹ر���Դ����Ӳ�����һ��
		out.close();
		System.out.println("����");
		
	}
	
	public static void show(Object ob) {
		System.out.println(ob);
	}

}
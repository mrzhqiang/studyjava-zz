package corejava3_5;

public class TestMath {
	public static void main(String[] args) {
		double x = 4;
		System.out.println(x);
		// ƽ����
		double y = Math.sqrt(x);
		System.out.println(y); // prints 2.0
		
		// ƽ��
		x = x * x;
		System.out.println(x);
		
		int a = 3;
		// �����㡣��ָ��x��a�η������x��ӡΪ16��3�η�����ôpow����x��a�η���
		y = Math.pow(x,a);
		System.out.println(y);
		// ��ȻMath���������㷽������ôƽ��Ӧ�ø���
		System.out.println(Math.pow(x, 2));
		
		/*Math������Ǻ���*/
		// �²⴫�ݲ���Ϊ30�ȣ���ô�������1/2
		System.out.println(Math.sin(30));
		// ������ˣ���ôӦ������Ҫһ�����ȣ��ҵ�Math���еĽǶ�ת�����ȷ���
		System.out.println(Math.sin(Math.toRadians(30)));
		// 30�ȶ�Ӧ�Ļ���
		System.out.println(Math.toRadians(30));
		
		// �Ƚ�int������float���͵����ֵ
		int m = Integer.MAX_VALUE;
		float f = Float.MAX_VALUE;
		System.out.println(m > f);
		// ��һ��float���ֵ
		System.out.println(f);
		
		// int����ת��Ϊfloat����Ϊʲô��ʧһ���ľ��ȣ�
		int n = 123456789;
		float adasdasdasd = n;
		double aaa = n;
		System.out.println(adasdasdasd);
		System.out.println(aaa);
		// Ϊʲô����ʧ���ȣ���Ϊ���Ƕ���4�ֽڵĴ洢�ռ䣬һ��int������ֵ����2��24�η���
		// �ͻ�Ӱ��float���͵Ĵ洢�ռ䣬����float���Ͷ�ʧ����
		
		double mN = 9.979797;
		int nx = (int)mN;
		System.out.println(nx);
		System.out.println(mN);
		
		// ++ ǰ׺���׺������
		int a1 = 10;
		int b1 = 5;
		// ��׺++
		b1 = a1++; // >>> ���� ��� b1 = a1 ����a1=a1+1;
		System.out.println(a1);
		System.out.println(b1);
		// ++ǰ׺
		b1 = ++a1; // >>> ������� a1=a1+1 ���� b1 = 1a;
		System.out.println(a1);
		System.out.println(b1);
		
		// �߼� �� �� ��
		// ��·�� && and
		int i = 1;
		if(1==i++/*true*/ && i==2/*true*/) {
			System.out.println("���߼����ͨ��");
		}
		// ��·�� || or
		if(1==2||2==2||3==3) {
			System.out.println("���߼����ͨ��");
		} else {
			System.out.println("���߼���ⲻͨ��");
		}
		// ��Ԫ�����
		int sanyuan = 1;
		sanyuan = 1==2||2==2||3==3?1:2;
		// ��
		if(!false) {
			System.out.println("");
		}
		
		String greeting = "Hello" ;
		String s = greeting.substring(0,3);// (0,3] 0��ָ�±�Ϊ0��3��ָ�����±꣬��������
		System.out.println(s);
		
		if("Hello"==greeting) {
			System.out.println("sdfsdfsdfsdfsdasdasdasdasd");
		}

		if(greeting.equals("hello")) {
//			System.out.println("sdfsdfsdfsdfsdasdasdasdasd");
		}
		
		// 50���API String�ķ���
		
	}

}
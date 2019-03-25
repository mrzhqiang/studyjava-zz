
public class StringAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String simple = "����һ�����ַ�����������һ��";
		// char charAt(int index)
		// ���ظ���λ�õĴ��뵥Ԫ�����ǶԵײ�Ĵ��뵥Ԫ����Ȥ��������Ҫ�������������
		// ����һ��char�ķ������ͣ�Ҫ��֤����������Ǿʹ�ӡ���ķ�������
		show(simple.charAt(0));// ��
		
		// int codePointAt(int index)
		// ���شӸ���λ�ÿ�ʼ�����
		// �������������������ã���ôֻ��ӡ�������;ͺ���
		show(simple.codePointAt(0));// 36825
		
		// ������Ϊ�������Ƚ���ϸ�����潫ʡ��һЩ����
		show(simple.offsetByCodePoints(0, 3) == simple.offsetByCodePoints(1, 2));// true
		
		String a = "001";
		String b = "002";
		show(a.compareTo(b));// -1
		show(b.compareTo(a));// 1
		
		show(simple.codePoints().toArray());// �������������Ȳ���������
		
		int[] codePoints = simple.codePoints().toArray();
		show(new String(codePoints, 1, 2));// ��һ
		
		show(simple.equals("��ȫ��һ�����ַ���"));// false
		
		show("AAAA".equalsIgnoreCase("aaaa"));// true
		
		String ssee = "ss�ǿ�ͷ����β��ee";
		show(ssee.startsWith("ss"));// true
		show(ssee.endsWith("ss"));// false
		
		show(simple.indexOf("��"));// 4 ˵���±꣨��������4
		show(simple.indexOf("��", 3));// 4 ˵�����±�3��ʼ�������ҵ�
		show(simple.indexOf(simple.codePointAt(1)));// 1 ȡ�ˡ��ǡ�����ַ����Ĵ���㣬�����±���1
		show(simple.indexOf(simple.codePointAt(1), 3));// -1 ���ڴ��±�3��ʼѰ�ҡ��ǡ�������û�У����Բ����ڣ�������-1
		
		show(simple.lastIndexOf("��"));// 0 ˵��ʵ����һ���Ǵ������ң�ǰ�浽ĩβ���ң�����Ǵ�������ĩβ��ǰ�棩��
		// ��ô�����˾�ʡ��ʣ�µ���������
		
		show("���������ַ����м������ȣ�".length());// ��Ȼ��15��
		
		show("����Ϥ�ķ�����ֱ�����".codePointCount(1, 3));// 2
		
		show("���˼�ע����������".replace("��", "��"));// ���˼�ע�����뼯��
		
		show("100100".substring(3));// 100
		
		show("100100".substring(3, 5));// 10
		
		show("AAAAA".toLowerCase());// aaaaa
		
		show("aaaaa".toUpperCase());// AAAAA
		
		show("   ͷ���ո�+  β���ո�  ".trim());// "ͷ���ո�+β���ո�"
		
		show(String.join("_", "2", "3"));
		// ��������������б�ˣ��Ҿ�֪������һ����̬�������������������ȥ����
		show(String.join("+", "1", "2", "3"));// 1+2+3
	}
	
	// ��static�ľ�̬������������ģ���˿�����main�б�����
	// ����Ա�������ģ���˿��Դ���һ�������ķ����������ظ�����
	// ��Ϊ�����Ǽ򵥵����������Կ��Բ������κ������ֱ�Ӵ���
	// ���������һЩ���ӵ����������Ҫͨ�̿����£���������ڡ����þ�̬������
	public static void show(Object object) {
		System.out.println(object);
	}

}
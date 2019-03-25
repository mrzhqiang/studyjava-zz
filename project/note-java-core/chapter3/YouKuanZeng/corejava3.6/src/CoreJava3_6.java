
public class CoreJava3_6
{
	public static void main(String[] args)
	{
		String a = "123456789";
		char b = a.charAt(6);
		System.out.println(b);
		//char charAt(int index)
		int c = a.codePointAt(3);
		System.out.println(c);
		//int codepointAt(int index)
		int d = a.offsetByCodePoints(0, 8);
		System.out.println(a);
		//int offsetByCodePoints(int startIndex, int cpCount)
		System.out.println(a.compareTo(a));
		//int compareTo(String other)
		System.out.println(a.codePoints());
		//intStream codePoints()
		System.out.println(a. String(d[] d );//这个地方，也是蒙蔽的
		//new String(int[] codepionts, int offset, int count)
		String f = "987654321";
		//System.out.printLn(a.equals(f));
		boolean g;
		g = a.equals(f);
		System.out.println(g);
		//boolean equals(Object other)
		System.out.println(a.equalsIgnoreCase(f));
		//boolean equalsIgnoreCase(String other)
		String h = "你是我生命中的一朵花++" ;
		System.out.println(h.startsWith(f));
		String j = "奇葩" ;
		System.out.println(j.endsWith(h));
		//boolean startsWith(String other)
		//boolean endWith(String suffix)
		int k = 6789 ;
		String l = "你怎么还不走天涯" ;
		System.out.println(h.indexOf(f));
		System.out.println(h.indexOf(j,0));
		System.out.println(h.indexOf(l));
		System.out.println(h.indexOf(5));
		System.out.println(h.length());
		System.out.println(h.lastIndexOf(j));
		System.out.println(h.lastIndexOf(j,1));
		System.out.println(h.lastIndexOf(0));
		System.out.println(h.lastIndexOf(0,1));
		System.out.println(j.codePointCount ( 1 , 3));
		System.out.println(j.replace(a,h));
		System.out.println(j.substring(2));
		System.out.println(j.substring(2, 4));
		System.out.println(j.toLowerCase());
		System.out.println(j.toUpperCase());
		System.out.println(j.trim());
		System.out.println(j.join(b,b));
		//charsequence这个参数不知道该怎么表达，字符序列的意思。
	}
	}



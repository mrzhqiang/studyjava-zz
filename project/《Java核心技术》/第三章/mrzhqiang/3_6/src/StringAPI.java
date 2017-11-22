
public class StringAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String simple = "这是一个简单字符串，尽量长一点";
		// char charAt(int index)
		// 返回给定位置的代码单元。除非对底层的代码单元感兴趣，否则不需要调用这个方法。
		// 它有一个char的返回类型，要验证这个方法，那就打印它的返回类型
		show(simple.charAt(0));// 这
		
		// int codePointAt(int index)
		// 返回从给定位置开始的码点
		// 并不清楚这个方法的作用，那么只打印返回类型就好了
		show(simple.codePointAt(0));// 36825
		
		// 上面作为样例，比较详细，后面将省略一些文字
		show(simple.offsetByCodePoints(0, 3) == simple.offsetByCodePoints(1, 2));// true
		
		String a = "001";
		String b = "002";
		show(a.compareTo(b));// -1
		show(b.compareTo(a));// 1
		
		show(simple.codePoints().toArray());// 按照书上做，先不管这个结果
		
		int[] codePoints = simple.codePoints().toArray();
		show(new String(codePoints, 1, 2));// 是一
		
		show(simple.equals("完全不一样的字符串"));// false
		
		show("AAAA".equalsIgnoreCase("aaaa"));// true
		
		String ssee = "ss是开头，结尾是ee";
		show(ssee.startsWith("ss"));// true
		show(ssee.endsWith("ss"));// false
		
		show(simple.indexOf("简单"));// 4 说明下标（索引）是4
		show(simple.indexOf("简单", 3));// 4 说明从下标3开始，还能找到
		show(simple.indexOf(simple.codePointAt(1)));// 1 取了“是”这个字符串的代码点，它的下标是1
		show(simple.indexOf(simple.codePointAt(1), 3));// -1 由于从下标3开始寻找“是”，后面没有，所以不存在，就有了-1
		
		show(simple.lastIndexOf("这"));// 0 说明实际上一个是从左往右（前面到末尾）找；这个是从右往左（末尾到前面）找
		// 那么理解了就省略剩下的三个方法
		
		show("随便打的这个字符串有几个长度？".length());// 当然是15字
		
		show("不熟悉的方法，直接玩吧".codePointCount(1, 3));// 2
		
		show("宽乃几注意力不集中".replace("不", "请"));// 宽乃几注意力请集中
		
		show("100100".substring(3));// 100
		
		show("100100".substring(3, 5));// 10
		
		show("AAAAA".toLowerCase());// aaaaa
		
		show("aaaaa".toUpperCase());// AAAAA
		
		show("   头部空格+  尾部空格  ".trim());// "头部空格+尾部空格"
		
		show(String.join("_", "2", "3"));
		// 看到方法名字倾斜了，我就知道这是一个静态方法，所以用类的名字去调用
		show(String.join("+", "1", "2", "3"));// 1+2+3
	}
	
	// 加static的静态方法是属于类的，因此可以在main中被调用
	// 程序员都是懒的，因此可以创建一个这样的方法，减少重复调用
	// 因为这里是简单的样例，所以可以不考虑任何情况，直接创建
	// 但是如果有一些复杂的情况，还是要通盘考虑下，否则就是在【滥用静态方法】
	public static void show(Object object) {
		System.out.println(object);
	}

}

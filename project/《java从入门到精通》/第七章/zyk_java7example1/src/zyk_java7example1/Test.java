package zyk_java7example1;

public class Test {

	public static void main(String[] args) {
		Book book = new Book("java", "zzz", 100.1);
		System.out.println("书名:" + book.getTitle());
		System.out.println("作者:" + book.getAuthor());
		System.out.println("价格:" + book.getPrice());
	}
}

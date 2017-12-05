package zyk_java7example1;

public class Book {
	private String title;
	private String author;
	private double price;
public Book(String title,String author,double price) {
	this.title = title;
	this.author = author;
	this.price = price;
}
public Book(String string) {
	// TODO Auto-generated constructor stub
}
public String getTitle() {
	return title;
}
public String getAuthor() {
	return author;
}
public double getPrice() {
	return price;
}
}

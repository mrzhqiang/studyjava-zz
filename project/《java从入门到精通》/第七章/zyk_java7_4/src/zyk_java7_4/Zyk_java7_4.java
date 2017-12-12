package zyk_java7_4;

public class Zyk_java7_4 {

	private String name;

	public String getName() {
		int id = 0;
		setName("Java");
		return id + this.name;
	}

	public void setName(String string) {
		this.name = string;
	}

	public static void main(String[] args) {
		Zyk_java7_4 zyk = new Zyk_java7_4();

		System.out.println(zyk.getName());
	}

}

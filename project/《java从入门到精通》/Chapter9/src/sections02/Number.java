package sections02;

public class Number {
	int x;
	
	public static class Inner {
		int x;
		
		public void setX(int x) {
			x = 1;
			this.x = 2;
//			Number.this.x = 3;
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		Number n = new Number();
		Inner i = new Inner();
		i.setX(10000);

		System.out.println(i.x);
		System.out.println(n.x);
	}

}

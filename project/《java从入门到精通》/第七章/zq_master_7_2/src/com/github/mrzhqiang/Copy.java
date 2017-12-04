package com.github.mrzhqiang;

public class Copy {
	
	static int i = 47;
	
	int j = 0;
	
	public void call() {
		System.out.println("µ÷ÓÃ");
		
		for (; j < 3; j++ ) {
			System.out.println(j+" ");
			if (j==2) {
				System.out.println("\n");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Copy t1 = new Copy();
		Copy t2 = new Copy();
		
		t2.i = 60;
		t1.call();
		System.out.println(""+t1.j++);

		System.out.println(""+t2.i);
		t2.call();
	}

}

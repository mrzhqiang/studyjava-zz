package zq_master_8;

public class Test {
	
	public static void main(String[] args) {

		IUSB pc = new PersonalComputer();
		IUSB nb = new Notebook();
		
		pc.data("С��Ƭ");
		nb.data("С��Ƭ");
		
		System.out.println(pc.getData());
		System.out.println(nb.getData());
	}

}

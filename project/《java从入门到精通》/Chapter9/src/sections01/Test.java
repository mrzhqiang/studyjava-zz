package sections01;

public class Test {

	public static void main(String[] args) {

		AbstractPeople people1 = new ChinesePeople();
		AbstractPeople people2 = new AmericanPeople();

		System.out.println(people1.getName());
		System.out.println(people2.getName());


		AbstractPeople people3 = new AbstractPeople() {

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "Õ‚–«»À";
			}
			
		};
		

		System.out.println(people3.getName());
		
		
	}

}

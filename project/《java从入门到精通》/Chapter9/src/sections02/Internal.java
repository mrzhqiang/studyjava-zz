package sections02;

public class Internal {
	
	private String content = "????????";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Internal i = new Internal();
		i.show();
		Internal.InternalClass clzz =  i.new InternalClass();
	}
	
	public void show() {
		new InternalClass().showContent();
	}
	
	private class InternalClass {
		private String name;
		
		public void showContent() {
			System.out.println(content);
		}
	}

}

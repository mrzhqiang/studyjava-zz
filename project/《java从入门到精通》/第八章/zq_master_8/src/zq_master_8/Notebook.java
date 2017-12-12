package zq_master_8;

public class Notebook implements IUSB {
	
	private String sData;

	@Override
	public void data(String value) {
		sData = value;
	}

	@Override
	public String getData() {
		return sData+"来自笔记本";
	}

}

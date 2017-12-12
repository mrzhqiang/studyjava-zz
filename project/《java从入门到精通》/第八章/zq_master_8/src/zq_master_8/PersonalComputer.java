package zq_master_8;

public class PersonalComputer implements IUSB {
	
	private String data;

	@Override
	public void data(String value) {
		this.data = value;
	}

	@Override
	public String getData() {
		return data+"À´×ÔµçÄÔ";
	}

}

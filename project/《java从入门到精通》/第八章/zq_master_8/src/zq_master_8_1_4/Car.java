package zq_master_8_1_4;

public class Car {

	private String name;
	protected double speed;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Car]: "+"name="+name+", speed="+speed;
	}
}

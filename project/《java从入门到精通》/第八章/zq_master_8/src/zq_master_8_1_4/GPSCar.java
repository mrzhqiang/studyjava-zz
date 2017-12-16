package zq_master_8_1_4;

public class GPSCar extends Car implements GPS {

	@Override
	public Point getLocation() {
		// TODO Auto-generated method stub
		
		Point p = new Point();
		p.x = 101.121;
		p.y = 89.222;
		return p;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName()+": name="+getName()+", speed="+speed;
	}
	
}

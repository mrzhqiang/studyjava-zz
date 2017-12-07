package zyk_vehicle;

public class Car extends Vehicle{
	public String name;
	String accelerator;
	String brake;
	String lighting;
	String acoustics;
	String navigation;
	public String driving(String direction, String wheelState) {
		if(direction.equals("前")){
			// 用switch控制方向的流程，if else if 控制加速减速静止的流程 OK?
			if(wheelState.equals("加速")){
				return( "你决定"+direction+wheelState+"，你踩下车子"+name+"的油门");
			}
		} else if(direction.equals("前")) {
			if(wheelState.equals("减速")){
				return( "你决定"+direction+wheelState+"，你踩下车子"+name+"的油门");
			}
		} else if(direction.equals("后")) {
			if(wheelState.equals("加速")){
				return( "你决定"+direction+wheelState+"，你踩下车子"+name+"的油门");
			}
		} else if(direction.equals("后")) {
			if(wheelState.equals("减速")){
				return( "你决定"+direction+wheelState+"，你踩下车子"+name+"的油门");
			}
		} else if(direction.equals("左")) {				
			if(wheelState.equals("加速")){
				return( "你决定"+direction+wheelState+"，你踩下车子"+name+"的油门");
			}				
		}else if(direction.equals("左")) {
			if(wheelState.equals("减速")){
				return( "你决定"+direction+wheelState+"，你踩下车子"+name+"的油门");						
			}
		}else if(direction.equals("右")) {
			if(wheelState.equals("加速")){
				return( "你决定"+direction+wheelState+"，你踩下车子"+name+"的油门");							
			}
		}else if(direction.equals("右")) {
			if(wheelState.equals("减速")){ 
				return( "你决定"+direction+wheelState+"，你踩下车子"+name+"的油门");
			}
		}else if(wheelState.equals("静止")) {	
			return("你决定"+wheelState);						
		}
		return  null;										
	}
	/*public Car(String name) {
		System.out.println("mini");
		}*/
	public Car(){
		this.name = "mini";
		System.out.println(name);
		}
	}

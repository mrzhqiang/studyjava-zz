package zyk_vehicle;

public class Truck extends Vehicle {
	public String name;
	public String driving(String direction, String wheelState) {
			switch(direction) {
				case "向前":{
					if(wheelState.equals("加速")) {
						return( "你决定"+direction+wheelState+"，你踩下车子"+name+"的油门");
					}else if(wheelState.equals("减速")) {
						return( "你决定"+direction+wheelState+"，你踩下车子"+name+"的油门");
					}else if(wheelState.equals("静止")) {
						return( "静止");
					}
				}
					break;
				case "向后":{
					if(wheelState.equals("加速")) {
						return( "你决定"+direction+wheelState+"，你踩下车子"+name+"的油门");
					}else if(wheelState.equals("减速")) {
						return( "你决定"+direction+wheelState+"，你踩下车子"+name+"的油门");
					}else if(wheelState.equals("静止")) {
						return( "静止");
					}
				}
					break;
				case "向左":{
					if(wheelState.equals("加速")) {
						return( "你决定"+direction+wheelState+"，你踩下车子"+name+"的油门");
					}else if(wheelState.equals("减速")) {
						return( "你决定"+direction+wheelState+"，你踩下车子"+name+"的油门");
					}else if(wheelState.equals("静止")) {
						return( "静止");
					}
				}
					break;
				case "向右":{
					if(wheelState.equals("加速")) {
						return( "你决定"+direction+wheelState+"，你踩下车子"+name+"的油门");
					}else if(wheelState.equals("减速")) {
						return( "你决定"+direction+wheelState+"，你踩下车子"+name+"的油门");
					}else if(wheelState.equals("静止")) {
						return( "静止");
					}
				}
					break;
			}
						return null;
		}
	public Truck(String futian){
		name = futian;
		System.out.println(name);
	}
}

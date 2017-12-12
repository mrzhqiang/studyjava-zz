package zyk_vehicle;

public class Truck extends Vehicle {
	public String name;

	public String driving(String direction, String wheelState) {
		// 剥离公共逻辑之后，你会发现做switch完全没有意义
		// 那么怎么做才有意义？
		// 当然是分析，前后左右到底有什么区别？
		// 前后，可能加速，左右，可能减速。分析到这里，恐怕这个驾驶的方法存在问题，应该需要改善。
		// 先到这里把，放过它。
		switch (direction) {
		case "向前": 
//			return handle(wheelState, direction);
		case "向后": 
//			return handle(wheelState, direction);
		case "向左": 
//			return handle(wheelState, direction);
		case "向右": 
			return handle(wheelState, direction);
		}
		return null;
	}
	
	private String handle(String wheelState, String direction) {
		if (wheelState.equals("加速")) {
			return ("你决定" + direction + wheelState + "，你踩下车子" + name + "的油门");
		} else if (wheelState.equals("减速")) {
			return ("你决定" + direction + wheelState + "，你踩下车子" + name + "的油门");
		} else if (wheelState.equals("静止")) {
			return ("静止");
		}
		return null;
	}

	public Truck(String futian) {
		name = futian;
		System.out.println(name);
	}
}

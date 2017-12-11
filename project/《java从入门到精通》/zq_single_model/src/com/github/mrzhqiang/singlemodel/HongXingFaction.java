package com.github.mrzhqiang.singlemodel;

public class HongXingFaction extends Faction {
	
	private static Faction INSTANCE = null;

	private HongXingFaction() {
		super("洪兴");
	}
	
	public static Faction getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new HongXingFaction();
		}
		return INSTANCE;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 单例模式实际上要在别的地方用，在这里用只是不想多创建一个Test类而已
		System.out.println(HongXingFaction.getInstance().getName());
		System.out.println(HongXingFaction.getInstance().getMember());
		System.out.println(HongXingFaction.getInstance().getLevel());
		System.out.println(HongXingFaction.getInstance().getMaxMember());
		
	}

}

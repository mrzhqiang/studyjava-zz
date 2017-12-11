package com.github.mrzhqiang.singlemodel;

/** 帮派 */
public class Faction {
	
	/** 名字 */
	private String name;
	/** 成员 */
	private int member;
	/** 等级 */
	private int level;
	/** 成员上限 */
	private int maxMember;

	public Faction(String name) {
		// 帮派名字不是自己诞生的，需要由外部来命名
		this.name = name;
		// 初始只能10个人组成帮派
		this.member = 10;
		// 初始等级只有1级
		this.level = 1;
		// 用不用this其实无所谓，编译后会自动加上
		this.countMaxMember();
	}
	
	public String getName() {
		return name;
	}
	
	public int getMember() {
		return member;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getMaxMember() {
		return maxMember;
	}
	
	/** 帮派重命名 */
	public void resetName(String newName) {
		if (newName == null || newName.isEmpty()) {
			System.err.println("命名无意义，不能是null或者空串");
		} else {
			name = newName;
		}
	}

	/** 增加帮派成员 */
	public void addMember(int number) {
		int temp = member + number;
		if (temp > maxMember) {
			System.err.println("当前帮派成员已达最大上限，抱歉");
		} else {
			member = temp;
		}
	}
	
	/** 升级 */
	public void upgrade() {
		level++;
		countMaxMember();
	}
	
	/** 计算当前等级帮派最大成员上限 */
	private void countMaxMember() {
		maxMember = level * 10;
	}
}

package com.github.mrzhqiang.section1;

/** 经理 */
public class Manager extends Employee {
  private int bonus;

  public Manager(String name, int salary) {
    super(name, salary);
  }

  public void addBonus(int bonus) {
    this.bonus = bonus;
  }

  @Override public int countSalary() {
    return super.countSalary() + bonus;
  }
}

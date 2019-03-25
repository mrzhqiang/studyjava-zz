package com.github.mrzhqiang.section3;

import java.time.LocalDate;

/** 员工 */
public class Employee {
  private String name;
  private double salary;
  private LocalDate hireDay;

  public Employee(String name, double salary, int year, int month, int day) {
    this.name = name;
    this.salary = salary;
    this.hireDay = LocalDate.of(year, month, day);
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public LocalDate getHireDay() {
    return hireDay;
  }

  /** 方法都有一个隐式参数，是对象的本身，也就是this */
  public void raiseSalary(double byPercent) {
    double raise = this.salary * byPercent / 100;
    salary += raise;
  }
}

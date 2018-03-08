package com.github.mrzhqiang.section5;

public class Employee {
  private String name;
  private double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public static void tripleValue(double x) {
    x = 3 * x;
    System.out.println("End of method: x=" + x);
  }

  public static void tripleSalary(Employee x) {
    x.raiseSalary(200);
    System.out.println("End of method: salary=" + x.getSalary());
  }

  public static void swap(Employee x, Employee y) {
    Employee temp = x;
    x = y;
    y = temp;
    System.out.println("End of method: x=" + x.getName());
    System.out.println("End of method: y=" + y.getName());
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public void raiseSalary(double byPercent) {
    double raise = salary * byPercent / 100;
    salary += raise;
  }
}

package com.github.mrzhqiang.section4;

/** 另外一个员工类 */
public class Employee {
  private static int nextId = 1;

  private String name;
  private double salary;
  private int id;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public int getId() {
    return id;
  }

  public void setId() {
    this.id = nextId;
    nextId++;
  }

  public static int getNextId() {
    return nextId;
  }
}

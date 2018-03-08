package com.github.mrzhqiang.section4;

import org.junit.Test;

public class EmployeeTest {
  @Test
  public void test() {
    Employee e = new Employee("Harry", 50000);
    System.out.println("name:" + e.getName() + ", salary:" + e.getSalary() + ", id:" + e.getId());
  }

  @Test
  public void testStatic() {
    Employee[] staff = new Employee[3];

    staff[0] = new Employee("Tom", 40000);
    staff[1] = new Employee("Dick", 60000);
    staff[2] = new Employee("Harry", 65000);

    for (Employee e : staff) {
      e.setId();
      System.out.println("name=" + e.getName() + ", id=" + e.getId() + ", salary=" + e.getSalary());
    }

    int n = Employee.getNextId();
    System.out.println("Next available id=" + n);
  }
}

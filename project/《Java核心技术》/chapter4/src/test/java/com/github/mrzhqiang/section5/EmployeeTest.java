package com.github.mrzhqiang.section5;

import org.junit.Test;

public class EmployeeTest {
  @Test
  public void testParam() {
    System.out.println("Testing tripleValue:");
    double percent = 10;
    System.out.println("Before: percent=" + percent);
    Employee.tripleValue(percent);
    System.out.println("After: percent=" + percent);

    System.out.println();
    System.out.println("Testing tripleSalary:");
    Employee harry = new Employee("Harry", 50000);
    System.out.println("Before: salary="+harry.getSalary());
    Employee.tripleSalary(harry);
    System.out.println("After: salary=" + harry.getSalary());

    System.out.println();
    System.out.println("Testing swap:");
    Employee a = new Employee("Alice", 70000);
    Employee b = new Employee("Bob", 60000);
    System.out.println("Before: a=" + a.getName());
    System.out.println("Before: b=" + b.getName());
    Employee.swap(a, b);
    System.out.println("After: a=" + a.getName());
    System.out.println("After: b=" + b.getName());
  }
}

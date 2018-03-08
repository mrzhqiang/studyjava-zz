package com.github.mrzhqiang.section3;

import org.junit.Test;

public class EmployeeTest {

  @Test
  public void testRaiseSalary() {
    // 建立一个员工类型的数组对象，固定大小为3
    Employee[] staff = new Employee[3];

    // 通过构造方法生成实例存储到数组中
    staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
    staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
    staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

    // 让每个员工都增加5%的工资
    for (Employee e : staff) {
      e.raiseSalary(5);
    }

    // 输出所有员工对象的信息
    for (Employee e : staff) {
      System.out.println(
          "name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" + e.getHireDay());
    }
  }
}

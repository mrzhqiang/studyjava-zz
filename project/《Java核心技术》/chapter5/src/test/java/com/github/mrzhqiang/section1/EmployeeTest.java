package com.github.mrzhqiang.section1;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

  @Test
  public void testCountSalary() {
    Employee employee = new Employee("zyk", 5000);
    Assert.assertEquals(employee.countSalary(), 5000);
  }
}

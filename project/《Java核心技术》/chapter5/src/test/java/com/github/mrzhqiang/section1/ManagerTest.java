package com.github.mrzhqiang.section1;

import org.junit.Assert;
import org.junit.Test;

public class ManagerTest {

  @Test
  public void testManager() {
    Manager zq = new Manager("zq", 6500);
    zq.addBonus(2500);
    Assert.assertEquals(zq.countSalary(), 9000);
  }
}

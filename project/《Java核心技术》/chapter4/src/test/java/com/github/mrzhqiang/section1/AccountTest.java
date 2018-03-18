package com.github.mrzhqiang.section1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

  private Account account;

  @Before
  public void generateAccount() {
    account = Account.create("1111", "1111");
  }

  @Test
  public void testAccount() {
    Account account1 = account;
    Account account2 = Account.create("2222", "2222");
    Assert.assertEquals(account, account1);
    Assert.assertNotEquals(account1, account2);
  }

  @Test
  public void testName() {
    Assert.assertEquals(account.getName(), "1111");

    account.setName("2222");
    Assert.assertNotEquals(account.getName(), "1111");
  }

  @Test
  public void testPassword() {
    Assert.assertEquals(account.getPswd(), "1111");

    account.setPswd("2222");
    Assert.assertNotEquals(account.getPswd(), "1111");
  }
}

package com.github.mrzhqiang.section2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

public class LocalDateTest {

  @Test
  public void testLocalDateNow() {
    System.out.println(LocalDate.now());
    // 2018-03-07
  }

  @Test
  public void testLocalDate() {
    LocalDate date1 = LocalDate.of(2000, 1, 1);
    LocalDate date2 = LocalDate.of(2000, 1, 1);
    Assert.assertEquals(date1, date2);

    Assert.assertEquals(date1.getYear(), 2000);
    Assert.assertEquals(date1.getMonthValue(), 1);
    Assert.assertEquals(date1.getDayOfMonth(), 1);

    LocalDate plusDays = date2.plusDays(365);
    System.out.println(plusDays);
    Assert.assertFalse(plusDays.equals(date2));
  }

  @Test
  public void testCurrentMonth() {
    // 构造本地日期——现在
    LocalDate date = LocalDate.now();
    // 取得月和日的值，暂存
    int month = date.getMonthValue();
    int today = date.getDayOfMonth();
    // 将 date 设置为月初，由于today是本月的第N天，因此 N - （N - 1）= 1，也就是本月的第1天
    date = date.minusDays(today - 1);
    // 识别月初是星期几
    DayOfWeek dayOfWeek = date.getDayOfWeek();
    // DayOfWeek是一个枚举类型，getValue自动将枚举下标+1，因此得到 1=星期一 2=星期二，以此类推
    int value = dayOfWeek.getValue();
    // 打印日历的标题，即 星期头
    System.out.println("Mon Tue Wed Thu Fri Sat Sun");
    // 开始打印第一天的位置，由于这个位置是由星期几决定的，所以我们需要一个for循环来做补位
    for (int i = 1; i < value; i++) {
      // 这里必须是四个空格，原因在于：星期头占三个字符，加上彼此的间隙空格，刚好是四个字符
      System.out.print("    ");
    }
    // 开始打印日历主体，使用循环来做控制，只要下一天的月份还是当月，那么就继续打印
    while (date.getMonthValue() == month) {
      System.out.printf("%3d", date.getDayOfMonth());
      // 如果是今天，那么打印一个星号，否则就只是多一个空格
      if (date.getDayOfMonth() == today) {
        System.out.print("*");
      } else {
        System.out.print(" ");
      }
      // 然后将日期推进到下一天，交给date保存
      date = date.plusDays(1);
      // 判断下一天是不是星期一，是的话，就需要换行
      if (date.getDayOfWeek().getValue() == 1) {
        System.out.println();
      }
    }
    // 这比《Java核心技术》第九版中的实现(不包含Java1.8)，要简单清晰很多
  }
}

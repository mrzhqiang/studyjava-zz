package com.github.mrzhqiang;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Prize {

  private static List<Integer> POOL = new ArrayList<>();

  private static final Random RANDOM = new SecureRandom();

  static {
    init();
  }

  private static void init() {
    POOL.clear();
    for (int i = 0; i < 100; i++) {
      POOL.add(i);
    }
  }

  public static int extract() {
    if (POOL.size() == 0) {
      init();
    }
    // 0 - 99
    int nextInt = RANDOM.nextInt(POOL.size());
    Integer prize = POOL.remove(nextInt);

    // 一等奖 0
    if (prize == 0) {
      return Level.LV_1;
    }

    // 二等奖 1-2
    if (prize == 1 || prize == 2) {
      return Level.LV_2;
    }

    // 三等奖 3-7
    if (prize >= 3 && prize < 8) {
      return Level.LV_3;
    }

    if (prize <= 99 && prize > 89) {
      return Level.LV_A;
    }

    // 未中奖
    return Level.LV_NOT;
  }
}

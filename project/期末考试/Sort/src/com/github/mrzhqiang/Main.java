package com.github.mrzhqiang;

public class Main {

  public static void main(String[] args) {
    // write your code here
    SelectionProblemData problemData = new SelectionProblemData(100000);

    int[] data = problemData.getDatas();

    //bubble(data);

    //select(data);

    insert(data);

    //quickSort(data);

    System.out.println(data);
  }

  // 17646 ms
  private static void bubble(int[] data) {
    long time = System.currentTimeMillis();
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data.length - 1 - i; j++) {
        if (data[j] < data[j + 1]) {
          int temp = data[j];
          data[j] = data[j + 1];
          data[j + 1] = temp;
        }
      }
    }

    long endTime = System.currentTimeMillis();
    System.out.println("time(ms): " + (endTime - time));
  }

  // 4238 ms
  private static void select(int[] data) {
    long time = System.currentTimeMillis();
    int len = data.length;
    int minIndex, temp;
    for (int i = 0; i < len - 1; i++) {
      minIndex = i;
      for (int j = i + 1; j < len; j++) {
        if (data[j] < data[minIndex]) {     //寻找最小的数
          minIndex = j;                 //将最小数的索引保存
        }
      }
      temp = data[i];
      data[i] = data[minIndex];
      data[minIndex] = temp;
    }

    long endTime = System.currentTimeMillis();
    System.out.println("time(ms): " + (endTime - time));
  }

  // 816 ms
  private static void insert(int[] data) {
    long time = System.currentTimeMillis();
    int len = data.length;
    int preIndex, current;
    for (int i = 1; i < len; i++) {
      preIndex = i - 1;
      current = data[i];
      while (preIndex >= 0 && data[preIndex] > current) {
        data[preIndex + 1] = data[preIndex];
        preIndex--;
      }
      data[preIndex + 1] = current;
    }
    long endTime = System.currentTimeMillis();
    System.out.println("time(ms): " + (endTime - time));
  }

  // 29 ms
  private static void quickSort(int[] data) {
    long time = System.currentTimeMillis();
    sort(data, 0, data.length - 1);
    long endTime = System.currentTimeMillis();
    System.out.println("time(ms): " + (endTime - time));
  }

  private static void sort(int a[], int low, int hight) {
    int i, j, index;
    if (low > hight) {
      return;
    }
    i = low;
    j = hight;
    index = a[i]; // 用子表的第一个记录做基准
    while (i < j) { // 从表的两端交替向中间扫描
      while (i < j && a[j] >= index) {
        j--;
      }
      if (i < j) {
        a[i++] = a[j];// 用比基准小的记录替换低位记录
      }
      while (i < j && a[i] < index) {
        i++;
      }
      if (i < j) {
        a[j--] = a[i];
      }
    }
    a[i] = index;// 将基准数值替换回 a[i]
    sort(a, low, i - 1); // 对低子表进行递归排序
    sort(a, i + 1, hight); // 对高子表进行递归排序
  }
}


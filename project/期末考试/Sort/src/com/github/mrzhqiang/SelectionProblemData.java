package com.github.mrzhqiang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Random;

public class SelectionProblemData {
  private final File dataFile = new File("data.dat");
  private final Random random = new SecureRandom();

  private final int[] datas;
  private final int k;

  public SelectionProblemData(int dataLength) {
    this.datas = new int[dataLength];
    this.k = dataLength / 2;
    try {
      create();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void create() throws IOException {
    if (!dataFile.exists()) {
      if (dataFile.createNewFile()) {
        System.out.println("Create file: " + dataFile);

        if (!dataFile.canWrite()) {
          throw new IOException("can not write file: " + dataFile);
        }

        for (int i = 0; i < datas.length; i++) {
          datas[i] = random.nextInt(datas.length);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dataFile, true))) {
          for (int d : datas) {
            writer.append(String.valueOf(d));
            writer.newLine();
          }
          writer.flush();
        } catch (Exception e) {
          throw new IOException("write data to file: " + dataFile, e);
        }
      }
    } else {
      try (BufferedReader reader = new BufferedReader(new FileReader(dataFile))) {
        String line = reader.readLine();
        int index = 0;
        while (line != null) {
          datas[index++] = Integer.valueOf(line);
          if (index >= datas.length) {
            break;
          }
          line = reader.readLine();
        }
      } catch (Exception e) {
        throw new IOException("read data failed.", e);
      }
    }
  }

  public int[] getDatas() {
    return datas;
  }
}

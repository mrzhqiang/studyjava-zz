package com.github.mrzhqiang.sections3;

import java.io.File;
import java.io.IOException;

/**
 * 12.3 File类
 */
public class Test {
    public static void main(String[] args) {
        try {
            File pngFile = new File("data/file_12_3_1.png");
            if (!pngFile.exists()) {
                pngFile.createNewFile();
            }
            File jpgFile = new File("data", "/file/file_12_3_1.jng");
            if (jpgFile.isDirectory()) {
                System.out.println("1111");
                jpgFile.delete();
                jpgFile.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

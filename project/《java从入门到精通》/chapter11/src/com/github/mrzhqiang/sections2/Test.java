package com.github.mrzhqiang.sections2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 11.2 异常的分类
 */
public class Test {
    public static void main(String[] args) {
        /* 11.2.1 可控式异常 */
        // sample 11.1
        // 代码提示 Ctrl + Alt + 空格
        // 代码补全 Ctrl + Shift + 回车
//        Example01 example01 = new Example01();

        /* 11.2.2 运行时异常 */
        // sample 11.2
//        Object ob = new Integer(10);
//        System.out.println((String)ob);
        // sample 11.3
//        Example02 example02 = new Example02();
//        int value = example02.getNumber(0);
//        System.out.println(value);
//        value = example02.getNumber(6);
//        System.out.println(value);
//        value = example02.getNumber(5);
//        System.out.println(value);

//        System.out.println(new RuntimeException("运行时异常").getLocalizedMessage());
//        System.out.println(new RuntimeException("运行时异常").getMessage());

        // sample 11.5
        readInfo();
    }

    private static void readInfo() {
        FileInputStream in = null;
        try {
            in = new FileInputStream("src/com/github/mrzhqiang/sections2/Test.java");
            System.out.println("创建文件输入流。");
            byte[] data = new byte[1024];
            String content;
            while (in.read(data) != -1) {
                content = new String(data);
                System.out.println(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                    System.out.println("关闭文件输入流。");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("输入流关闭出现错误");
                }
            }
        }
    }
}

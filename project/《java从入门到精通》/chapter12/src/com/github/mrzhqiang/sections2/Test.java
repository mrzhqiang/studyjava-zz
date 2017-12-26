package com.github.mrzhqiang.sections2;
import java.io.*;

/** 12.2 输入输出流 */
public class Test {
    public static void main(String[] args) {
        InputStream is = null;
        Reader reader = null;
        OutputStream os = null;
        Writer writer = null;
        try {
            // 12.2.1 InputStream
            /*is = new FileInputStream("sections2/src/Test.java");
            byte[] data = new byte[1024];
            while (is.read(data) != -1) {
                System.out.println(new String(data));
            }*/

            // Reader
            /*reader = new FileReader("sections2/src/Test.java");
            char[] string = new char[1024];
            while (reader.read(string) != -1) {
                System.out.println(new String(string));
            }*/

            // 12.2.2 OutputStream
            /*os = new FileOutputStream("data/file_12_2_2.txt");
            String content = "youkuanzeng";
            os.write(content.getBytes());
            os.flush();*/

            // Write
            writer = new FileWriter("data/file_12_2_2.txt", true);
            writer.write("mrzhqiang1111");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

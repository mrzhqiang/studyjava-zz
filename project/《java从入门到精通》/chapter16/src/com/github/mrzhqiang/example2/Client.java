package com.github.mrzhqiang.example2;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Client {
    public static void openUrl(String link) {
        try {
            URL url = new URL(link);
            URLConnection urlConnection = url.openConnection();
            urlConnection.connect();
            InputStream is = urlConnection.getInputStream();
            Reader reader = new InputStreamReader(is, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client.openUrl("https://upload-images.jianshu.io/upload_images/1802116-a5bca4a2113d8fb5.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/430");
    }
}

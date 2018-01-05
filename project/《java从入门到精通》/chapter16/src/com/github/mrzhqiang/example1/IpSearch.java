package com.github.mrzhqiang.example1;

import java.io.*;
import java.nio.charset.Charset;

public class IpSearch extends Thread {
    private static final String LAN_PREFIX = "192.168.0.";

    private static int count = 1;

    private final int startIndex;
    private final int maxIndex;

    private long startTime;

    public IpSearch(int startIndex, int maxIndex) {
        this.startIndex = startIndex;
        this.maxIndex = maxIndex;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < maxIndex; i++) {
            String ip = LAN_PREFIX + i;
            try {
                Process mProcess = Runtime.getRuntime().exec("ping " + ip + " -w 280 -n 1");
                InputStream inputStream = mProcess.getInputStream();
                byte[] data = new byte[1024];
                int row = inputStream.read(data);
                while (row != -1) {
                    System.out.println(new String(data));
                    row = inputStream.read(data);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("查找IP线程结束");
        count++;
        if (count == 12) {
            System.out.println("用时：" + (System.currentTimeMillis() - startTime));
        }
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
}

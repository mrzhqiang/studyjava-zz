package com.github.mrzhqiang.sections7;

import javax.swing.*;
import java.awt.*;

public class WaitAndNotify extends JFrame {

    private final Object lock = new Object();
    private final Thread t1;
    private final Thread t2;
    private int count = 0;

    public static void main(String[] args) {
        new WaitAndNotify();
    }

    public WaitAndNotify() throws HeadlessException {
        t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (count == 0) {
                        synchronized (lock) {
                            try {
                                System.out.println("递减时，进度为0，进入等待状态");
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    System.out.println("递减线程，当前进度：" + (--count));
                    try {
                        Thread.sleep(110);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (count >= 100) {
                        System.out.println("递增线程，已满，等待递减");
                        break;
                    }
                    if (count == 0) {
                        count += 100;
                        System.out.println("递增线程，当前进度：" + count);
                        synchronized (lock) {
                            System.out.println("进度已有，可以递减");
                            lock.notify();
                        }
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }

}

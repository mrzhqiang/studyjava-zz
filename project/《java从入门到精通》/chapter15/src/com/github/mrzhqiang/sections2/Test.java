package com.github.mrzhqiang.sections2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        /*Thread headsetFactory = new HeadsetFactory("HeadsetFactory");
        headsetFactory.start();
        // 如果线程已经启动，但未结束，那么就一定会抛出异常；其他情况并不明确
//        headsetFactory.start();

        HeadsetFans fans = new HeadsetFans();

        new Thread(fans).start();*/

        JFrame jFrame = new ColorRandom();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(100, 100);
        jFrame.setVisible(true);
    }

    public static class HeadsetFans extends Object implements Runnable {
        @Override
        public void run() {
            System.out.println("消费10元购买耳机");
        }
    }

    public static class HeadsetFactory extends Thread {
        public HeadsetFactory() {
        }

        public HeadsetFactory(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(getName() + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class ColorRandom extends JFrame {
        private static final Random random = new Random();
        private static Color[] color = {
                Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE
        };

        private Thread t;

        private static Color getColor() {
            return color[random.nextInt(color.length)];
        }

        public ColorRandom() throws HeadlessException {
            t = new Thread(new Runnable() {
                int x = 30;
                int y = 50;
                @Override
                public void run() {
                    while (true) {
                        try {
                            t.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Graphics graphics = getGraphics();
                        graphics.setColor(getColor());
                        graphics.drawLine(x, y, 100, y++);
                        if (y >= 80) {
                            y = 50;
                        }
                    }
                }
            });
            t.start();
        }
    }
}

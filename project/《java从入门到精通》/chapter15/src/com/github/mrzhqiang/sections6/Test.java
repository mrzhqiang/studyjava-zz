package com.github.mrzhqiang.sections6;

public class Test {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        Thread a = new Thread(ticket);
        Thread b = new Thread(ticket);
        Thread c = new Thread(ticket);
        Thread d = new Thread(ticket);

        a.start();
        b.start();
        c.start();
        d.start();
    }

    public static class Ticket implements Runnable {
        private final Object lock = new Object();

        int number = 100;

        @Override
        public void run() {
            while (true) {
                if (!showNumber()) {
                    break;
                }
            }
        }

        private synchronized boolean showNumber() {
            if (number > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("车票还有 " + (number--) + " 张");
                return true;
            }
            return false;
        }
    }
}

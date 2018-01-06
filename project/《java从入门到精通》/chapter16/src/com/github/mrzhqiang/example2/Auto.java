package com.github.mrzhqiang.example2;

public class Auto extends Client implements Runnable {
    @Override
    public void run() {
        System.out.println("111");
    }

    public static void main(String[] args) {
        Auto auto = new Auto();
        new Thread(auto).start();
    }
}

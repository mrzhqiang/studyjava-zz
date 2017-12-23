package com.github.mrzhqiang.sections2;

public class Example01 {
    private int num = 10;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Example01() {
        try {
            Class.forName("com.github.mrzhqiang.sections2.Test11");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("getLocalizedMessage:" + e.getLocalizedMessage());
            System.out.println("getMessage:" + e.getMessage());
            System.out.println("toString:" + e.toString());
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        System.out.println("测试。");
    }
}

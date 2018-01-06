package com.github.mrzhqiang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
//import java.util.concurrent.TimeUnit;

public class MyTCP {
    private BufferedReader bufferedReader;
    private ServerSocket serverSocket;
    private Socket socket;

    void getServer() {
        try {
            serverSocket = new ServerSocket(8998);
//            serverSocket.setSoTimeout((int) TimeUnit.SECONDS.toMillis(10));
            System.out.println("套接字创建成功");
            for (; ; ) {
                System.out.println("等待客户连接");
                socket = serverSocket.accept();
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                getClientMessage();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getClientMessage() {
        try {
            while (true) {
                System.out.println("客户端：" + bufferedReader.readLine());
            }
        } catch (Exception e) {
            System.out.println("客户端完成连接");
        }
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyTCP tcp = new MyTCP();
        tcp.getServer();
    }
}

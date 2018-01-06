package com.github.mrzhqiang;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class MyClient {

    private Socket socket;

    public void connect() {
        try {
            // 112.81.4.230
            socket = new Socket("192.168.0.10", 8998);
            System.out.println("完成连接");
            InetAddress inetAddress = socket.getInetAddress();
            System.out.println("服务器地址："+inetAddress.getHostAddress());
            System.out.println("服务器端口："+socket.getPort());

            InetAddress localAddress = socket.getLocalAddress();
            System.out.println("客户端地址："+localAddress.getHostAddress());
            System.out.println("客户端端口："+socket.getLocalPort());
            OutputStream os = socket.getOutputStream();
            Writer writer = new OutputStreamWriter(os);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Hello Server!\n");
            bufferedWriter.flush();
            System.out.println("完成服务器连接");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("准备连接：192.168.0.10");
        new MyClient().connect();
    }
}

package com.github.mrzhqiang;

import java.io.*;
import java.net.Socket;

public class MyClient {

    private Socket socket;

    public void connect() {
        try {
            socket = new Socket("112.81.4.230", 8998);
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
        new MyClient().connect();
    }
}

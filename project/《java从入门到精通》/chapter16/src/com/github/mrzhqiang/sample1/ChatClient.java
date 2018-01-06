package com.github.mrzhqiang.sample1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

    private final String name;
    private Socket socket;
    private OutputStreamWriter osw;

    public ChatClient(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws IOException {
        ChatClient chatClient = new ChatClient("mrzhqiang");
        chatClient.createClientSocket();
        try {
            chatClient.login();
        } catch (IOException e) {
            System.out.println("登录失败");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (line.startsWith(">退出")) {
                System.out.println("准备退出聊天室..");
                chatClient.logout();
                break;
            } else {
                chatClient.sendMessage(line);
            }
        }
        if (chatClient.osw != null) {
            chatClient.osw.close();
        }
        if (chatClient.socket != null) {
            chatClient.socket.close();
        }

    }

    public void createClientSocket() {
        try {
            // 112.81.4.230
            socket = new Socket("192.168.0.10", 1234);
            osw = new OutputStreamWriter(socket.getOutputStream());
            new ClientThread(socket).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void login() throws IOException {
        if (osw != null) {
            osw.write(">登录" + name + "\n");
            osw.flush();
        }
    }

    public void logout() throws IOException {
        if (osw != null) {
            osw.write(">退出" + "\n");
            osw.flush();
        }
    }

    public void sendMessage(String msg) throws IOException {
        if (osw != null) {
            osw.write(msg + "\n");
            osw.flush();
        }
    }

    private static class ClientThread extends Thread {
        private final Socket socket;

        private ClientThread(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            InputStream is = null;
            try {
                is = socket.getInputStream();
                InputStreamReader reader = new InputStreamReader(is);
                BufferedReader bufferedReader = new BufferedReader(reader);
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        System.out.println(line);
                    }
                    sleep(500);
                }
            } catch (Exception e) {
                System.out.println("客户端读取结束");
            } finally {
                if (is != null) {
                    try {
                        is.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}

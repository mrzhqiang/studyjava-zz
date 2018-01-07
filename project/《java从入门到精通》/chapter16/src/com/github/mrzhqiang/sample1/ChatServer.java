package com.github.mrzhqiang.sample1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ChatServer {
    // 相当于名单，只要知道名字，就能找到对应的套接字，进行消息转发
    public static final Map<String, Socket> CLIENT_LIST = new HashMap<>();

    public static void main(String[] args) {
        new ChatServer().createSocket();
    }

    public void createSocket() {
        try {
            ServerSocket server = new ServerSocket(8998);
            while (true) {
                System.out.println("等待客户端连接...");
                // 等待客户连接，一旦有客户端请求连接，就创建一个对应的“服务人员”的套接字对象，进行服务
                Socket socket = server.accept();
                System.out.println("客户端：" + socket + " 连接成功");
                // 启动线程进行解析，识别客户端的指令或者消息
                new ServerThread(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ServerThread extends Thread {

        private final Socket mSocket;
        private String name;

        private ServerThread(Socket mSocket) {
            this.mSocket = mSocket;
        }

        @Override
        public void run() {
            try {
                // 获得套接字对象的输入流
                InputStream is = mSocket.getInputStream();
                // 通过输入流创建一个输入流读取器
                Reader reader = new InputStreamReader(is);
                // 通过输入流读取器，创建一个带缓冲的读取器
                BufferedReader bufferedReader = new BufferedReader(reader);
                // 无限循环，直到客户端断开连接
                while (true) {
                    // 读取客户端发来的消息，猜测：有可能客户端没有任何消息，那么就阻塞在这边
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        sleep(500);
                        continue;
                    }

                    String message;
                    OutputStream os = mSocket.getOutputStream();
                    if (line.startsWith(">登录")) { // 如果是以规定的登录方式开头，那么识别为登录
                        String name = line.replaceAll(">登录", "");
                        this.name = name;
                        CLIENT_LIST.put(name, mSocket);
                        System.out.println("登录成功：" + name);

                        Set<String> nameSet = CLIENT_LIST.keySet();
                        String nameList = "在线用户：";
                        for (String key : nameSet) {
                            nameList += key + ",";
                        }
                        message = "【系统】：登录成功====" + nameList + "\n";
                    } else if (line.startsWith(">退出")) { // 如果是以规定的退出方式开头，那么识别为退出
                        CLIENT_LIST.remove(name);
                        System.out.println("离线成功：" + name);

                        message = "【系统】：离线成功\n";
                    } else {// 这里就代表为其他消息，不需要做特殊操作
                        // 首先获得目标的用户名
                        String msg = "【" + name + "】：" + line + "\n";
                        for (String targetName : CLIENT_LIST.keySet()) {
                            if (!targetName.equals(name)) {
                                Socket socket = CLIENT_LIST.get(targetName);
                                if (socket != null && !socket.isClosed() && socket.isConnected()) {
                                    sendMsg(socket.getOutputStream(), msg);
                                }
                            }
                        }
                        System.out.println(msg);
                        message = "【系统】：发送成功\n";
                    }
                    sendMsg(os, message);
                    // 不能在这里关闭流，是因为输出流通过getOutputStream()获得的，如果close就会关闭socket
//                    os.close();
                }

            } catch (Exception e) {
                CLIENT_LIST.remove(name);
                System.out.println("客户端 " + name + " 断开连接");
            }
        }

        private void sendMsg(OutputStream os, String msg) throws IOException {
            OutputStreamWriter writer = new OutputStreamWriter(os);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(msg);
            bufferedWriter.flush();
        }
    }
}


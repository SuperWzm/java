package com.bit.chatroom.sever;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-06-23
 * Time: 10:16
 **/
public class SingleThreadSever {

    public static void main(String[] args) {
        int port = 4406;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("服务端启动了，运行在 "+serverSocket.getLocalSocketAddress());
            //等待客户端连接
            Socket socket = serverSocket.accept();

            //数据接收和发送
            //1.接收
            InputStream in = socket.getInputStream();
            Scanner scanner = new Scanner(in);
            System.out.println("客户端说："+scanner.nextLine());

            //2.发送
            OutputStream out = socket.getOutputStream();
            PrintStream printStream = new PrintStream(out);
            printStream.println("欢迎，欢迎");
            printStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}    
    
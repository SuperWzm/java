package com.bit.chatroom.client;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-06-23
 * Time: 10:31
 **/
public class SingleThreadClient {
    public static void main(String[] args) {
        String ip = "127.0.0.1";//回环地址
        int port = 4406;

        try {
            Socket socket = new Socket(ip,port);

            //发送
            OutputStream out = socket.getOutputStream();
            PrintStream printStream = new PrintStream(out);
            printStream.println("服务器，我来了");
            printStream.flush();

            //接收
            InputStream in = socket.getInputStream();
            Scanner scanner = new Scanner(in);
            System.out.println("来自服务器的数据："+scanner.nextLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
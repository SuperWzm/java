package com.bit.client;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-06-26
 * Time: 12:54
 **/
public class WriteDataToServerThread extends Thread {

    private final Socket socket;

    public WriteDataToServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            OutputStream out = this.socket.getOutputStream();
            PrintStream printStream = new PrintStream(out);
            Scanner scanner = new Scanner(System.in);
            while (true){
                System.out.println("请输入>");
                String message = scanner.nextLine();
                printStream.println(message);
                printStream.flush();
                if(message.equals("bye")){
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    
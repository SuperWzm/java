package com.bit.client;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-06-26
 * Time: 12:53
 **/
public class ReadDataFromServerThread extends Thread {

    private final Socket socket;

    public ReadDataFromServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream in = this.socket.getInputStream();
            Scanner scanner = new Scanner(in);
            while (true){
                try {
                    String message = scanner.nextLine();
                    System.out.println("来自服务端>" + message);
                }catch(NoSuchElementException e){
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
    
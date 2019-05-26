package com.bittch.reflect.newio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-26
 * Time: 22:24
 **/
public class TestEncodingDecoding {

    public static void main1(String[] args) {
        System.getProperties().list(System.out);
        String userHome = System.getProperty("user.home");
        System.out.println(userHome);
    }

    public static void main(String[] args) {
        try(OutputStream out = new FileOutputStream("D:"+ File.separator+"test"+File.separator+"encoding.txt")){
            out.write("比特科技".getBytes("IS08859-1"));
            out.write("比特科技".getBytes(StandardCharsets.ISO_8859_1));
            //out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}    
    
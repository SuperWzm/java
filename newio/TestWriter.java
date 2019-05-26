package com.bittch.reflect.newio;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-25
 * Time: 22:49
 **/
public class TestWriter {
    public static void main1(String[] args) {
        File file = new File("D:"+File.separator+"test"+File.separator+"b"+File.separator+"writer.txt");
        File parent = file.getParentFile();
        if(!parent.exists()){
            boolean effect = parent.mkdirs();
            if(!effect){
                throw new RuntimeException("create directory"+parent.getAbsolutePath()+"failed");

            }
        }

        try(FileWriter writer = new FileWriter(file)){
            writer.append('A').append("Hello World").append('\n');
            writer.write("I老虎U！");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File file = new File("D:"+File.separator+"test"+File.separator+"b"+File.separator+"writer.txt");
        try(FileReader reader = new FileReader(file)) {
//        char[] buff = new char[1024];
//        int len = reader.read(buff);
//            System.out.println("读了："+len+"个字符");
//            System.out.println(new String(buff));


         char[] buff = new char[5];
        int len = -1;
        while ((len=reader.read(buff)) != -1){
            System.out.println(new String (buff,0,len));
        }

        } catch (IOException e) {
            e.printStackTrace();
       }


    }
}    
    
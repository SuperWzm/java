package com.bittch.reflect.newio;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-25
 * Time: 21:54
 **/
//1丶
//字节输出流：通过程序进行内容输出
public class TestIo {
//    public static void main(String[] args) {
//        File file = new File("D:"+File.separator+"test"+File.separator+"java"+File.separator+"Hello.text");
//        if(!file.getParentFile().exists()){
//            file.getParentFile().mkdirs();
//        }
//        try {
//            OutputStream out = new FileOutputStream(file);
//            String msg = "我爱你";
//            try {
//                out.write(msg.getBytes());
//                out.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        File file = new File("D:"+File.separator+"test"+File.separator+"java"+File.separator+"Hello.text");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        try {
            OutputStream out = new FileOutputStream(file,true);
            String msg = "我爱你";
            try {
                out.write(msg.getBytes());
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}    
    
package com.bittch.reflect.newio;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-25
 * Time: 21:42
 **/

//3丶
//InputStream  字节输入流
public class TestInputStream {

    public static void main(String[] args){

        File file = new File("D:"+File.separator+"test"+File.separator+"Hello.text");
        //读文件，文件必须存在

            try(FileInputStream inputStream = new FileInputStream(file)){
//                int value = -1;
//                while((value = inputStream.read()) != -1){
//                    System.out.println((char) value);
//                }

//                byte[] buff = new byte[5];
//                int len = -1;
//                while ((len = inputStream.read(buff)) != -1){
//                    System.out.println(new String(buff,0,len));
//                }

                byte[] buff = new byte[5];
                inputStream.read(buff);
                inputStream.read(buff,2,2);
                System.out.println(new String(buff));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}    
    
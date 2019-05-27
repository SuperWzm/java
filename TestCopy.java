package com.bittch.reflect.io;


import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-25
 * Time: 17:03
 **/
public class TestCopy {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("D:"+File.separator+"test"+File.separator+"a.txt");
        File destFile = new File("D:"+File.separator+"test"+File.separator+"b.txt");
        if(!srcFile.isFile() || srcFile.exists()){
            srcFile.mkdirs();
        }
        if(!destFile.exists()){
            destFile.mkdirs();
        }
        if(!srcFile.getParentFile().exists()){
            srcFile.mkdirs();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(srcFile);
           FileOutputStream fileOutputStream = new FileOutputStream(destFile);
           byte[] data = new byte[1024];
           int len = 0;
           while((len = fileInputStream.read(data)) != -1 ){
               try {
                   fileOutputStream.write(data,0,len);
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}    
    
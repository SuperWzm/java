package com.bittch.reflect.newio;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-26
 * Time: 22:42
 **/
public class TestStreamConvert {

    public static void main(String[] args) {
        File file = new File("D:" + File.separator + "test" + File.separator + "b" + File.separator + "writer.txt");
        //字节流
        //InputStream -> FileInputStream
       try(InputStream in = new FileInputStream(file);

           Reader reader = new InputStreamReader(in)
       ){
           char[] buff = new char[1024];
           int len = -1;
           while ((len=reader.read(buff)) != -1){
               System.out.println(new String(buff,0,len));
           }
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }

    }
}    
    
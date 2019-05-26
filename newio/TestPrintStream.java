package com.bittch.reflect.newio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.PrimitiveIterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-26
 * Time: 22:33
 **/
public class TestPrintStream {
    public static void main(String[] args) {
        File file = new File("D:"+File.separator+"test"+File.separator+"printstream.txt");
     try(PrintStream printStream = new PrintStream(new FileOutputStream(file))) {

//         printStream.print("姓名：");
//         printStream.println("张三");
//         printStream.print("年龄:");
//         printStream.println(28);

         printStream.printf("姓名：%s  年龄：%d  身高： %.2f\n","张三",28,176.456);
         printStream.printf("姓名：%s  年龄：%d  身高： %.2f","张三",28,176.456);
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     }
    }
}    
    
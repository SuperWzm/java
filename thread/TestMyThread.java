package com.bit.thread;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-06-03
 * Time: 19:35
 **/
public class TestMyThread {
    public static void main(String[] args) {
        System.out.println("这是main方法的开始");
        MyThread myThread1 = new MyThread("thread1");
        MyThread myThread2 = new MyThread("thread2");
        MyThread myThread3 = new MyThread("thread3");

        myThread1.start();
        myThread2.start();
        myThread3.start();
//        myThread1.start();
        System.out.println("这是main方法的结束");
    }

}    
    
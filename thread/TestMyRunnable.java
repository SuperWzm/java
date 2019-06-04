package com.bit.thread;


import sun.awt.windows.ThemeReader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-06-03
 * Time: 20:19
 **/
public class TestMyRunnable {


    public static void main1(String[] args) {
        System.out.println("这是main方法的开始");
        MyRunnable runnable1 = new MyRunnable("MyRunnable1");
        MyRunnable runnable2 = new MyRunnable("MyRunnable2");

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        System.out.println("这是main方法的结束");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable(){

            @Override
            public void run() {
                for (int i = 0; i<10;i++){
                    System.out.println("Thread2  " +i);
                }
            }
        });
        thread1.start();
    }
}
    
package com.bit.thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-06-05
 * Time: 19:18
 **/
public class TestThreadMethod {

    public static void main1(String[] args) {

        new Thread(()-> {


            System.out.println("Start:" + LocalDateTime.now());
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());

                System.out.println("End:" + LocalDateTime.now());
            }
        },"Thread-sleep").start();
    }

   static class RunnableJoin implements  Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+"执行开始时间："+LocalDateTime.now());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"假装这里有代码");
            System.out.println(Thread.currentThread().getName()+"执行结束时间："+LocalDateTime.now());
        }
    }
    public static void main2(String[] args) {
        Thread thread = new Thread(new RunnableJoin(),"Thread-B");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"中的代码"+LocalDateTime.now());
    }


    public static void main3(String[] args) {
//        Date date = new Date();
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(format.format(date));


//        LocalDateTime now = new LocalDateTime.now();
//        System.out.println(now.format(DateTimeFormatter.BASIC_ISO_DATE));



    }

    public static void main4(String[] args) {
        Thread thread1 = new Thread(()-> System.out.println(Thread.currentThread().getName()+"优先级"+Thread.currentThread().getPriority()),"Thread-1");
        thread1.setPriority(10);
        thread1.start();

        System.out.println(Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getPriority()+""+LocalDateTime.now());
            }
        }
    }
}

    
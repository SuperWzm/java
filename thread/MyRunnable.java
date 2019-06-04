package com.bit.thread;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-06-03
 * Time: 20:14
 **/
public class MyRunnable implements Runnable {


    private final String title;

    public MyRunnable(String title){
        this.title = title;
    }
    @Override
    public void run() {
        for (int i = 0; i<10 ;i++){
            System.out.println(this.title+"  "+i);
        }
    }
}
    
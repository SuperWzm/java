package com.bit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-06-11
 * Time: 19:38
 **/
public class TestNotify {
    public static void main(String[] args) {
        final Object object = new Object();
        Thread wait1 = new WaitThread(object);
        wait1.setName("Thread-等待线程1");
        Thread wait2 = new WaitThread(object);
        wait2.setName("Thread-等待线程2");

        Thread notify = new NotifyThread(object);
        notify.setName("Thread-通知线程");

        wait1.start();
        wait2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        object.notifyAll();
    }
}    
    
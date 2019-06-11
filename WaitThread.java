package com.bit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-06-11
 * Time: 19:35
 **/
public class WaitThread extends Thread {
    private final Object object;



    public WaitThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object){
            System.out.println(Thread.currentThread().getName()+"等待执行");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"结束执行");
        }
    }
}
    
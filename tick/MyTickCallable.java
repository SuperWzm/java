package com.bit.thread.tick;

import java.util.concurrent.Callable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-06-04
 * Time: 18:42
 **/
public class MyTickCallable implements Callable {
    private int tick = 10;

    @Override
    public Object call() {
        while(this.tick>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                if(tick>0){
                    System.out.println(Thread.currentThread().getName()+"买了一张票，剩余"+(--this.tick));
                }
            }
        }
        return "票卖光了";
    }
}
    
package com.bit.thread;

import sun.util.resources.cldr.lag.CalendarData_lag_TZ;

import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-06-03
 * Time: 20:57
 **/
public class TestMyCallable {
    public static void main(String[] args) {
        Callable<Integer> callable = new MyCallable();

        //Runnable ->run ->void
        //Callable ->run ->V(int)

        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();

        try {
            Integer sum = null;//阻塞任务
            try {
                sum = futureTask.get(1,TimeUnit.MILLISECONDS);
                System.out.println(sum);
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
                    } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("main结束");
    }
}    
    
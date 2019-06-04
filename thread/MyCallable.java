package com.bit.thread;

import java.util.concurrent.Callable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-06-03
 * Time: 20:54
 **/
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i<10;i++){
            sum+=i;
        }
        Thread.sleep(1000);
        return sum;
    }
}
    
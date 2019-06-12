package com.bit.executor;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-06-12
 * Time: 21:08
 **/
public class TestExecutors {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(()->{
                System.out.println(Thread.currentThread().getName()+"  "+LocalDateTime.now().toString());
            });
        }
    }
}    
    
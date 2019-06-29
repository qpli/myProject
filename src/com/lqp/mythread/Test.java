package com.lqp.mythread;

import java.util.concurrent.CountDownLatch;

/**
 * Created by lqp
 * Date: 2019/6/28
 */
public class Test {
    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(2);
        try{
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join();
            System.out.println("我想当threadTest对象执行完毕之后我再执行，我做到了！");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

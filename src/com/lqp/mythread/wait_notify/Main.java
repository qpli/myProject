package com.lqp.mythread.wait_notify;

/**
 * Created by lqp
 * Date: 2019/7/18
 */
public class Main {

    public static void main(String[] args) {
        Object lock = new Object();
        Thread1 t1 = new Thread1(lock);
        t1.start();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Thread2 t2 = new Thread2(lock);
        t2.start();
    }


}

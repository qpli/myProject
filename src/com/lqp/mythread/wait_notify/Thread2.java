package com.lqp.mythread.wait_notify;

/**
 * Created by lqp
 * Date: 2019/7/18
 */
public class Thread2 extends Thread {
    private Object lock;
    public Thread2(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run(){
        synchronized (lock){
            System.out.println("¿ªÊ¼notify");
            lock.notify();
            System.out.println("½áÊønotify");
        }
    }

}

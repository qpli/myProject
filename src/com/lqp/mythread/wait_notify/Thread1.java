package com.lqp.mythread.wait_notify;

/**
 * Created by lqp
 * Date: 2019/7/18
 */
public class Thread1 extends Thread{

    private Object lock;
    public Thread1(Object lock){
        super();
        this.lock=lock;
    }

    @Override
    public void run() {
        try{
            synchronized (lock){
                System.out.println("¿ªÊ¼wait");
                lock.wait();
                System.out.println("½áÊøwait");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

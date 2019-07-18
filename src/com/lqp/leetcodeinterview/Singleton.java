package com.lqp.leetcodeinterview;

/**
 * Created by lqp
 * Date: 2019/7/18
 */
public class Singleton {

    private static Singleton singleton = new Singleton();
    private Singleton(){}
    public Singleton getInstance(){
        return singleton;
    }


}

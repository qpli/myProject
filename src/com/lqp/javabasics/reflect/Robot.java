package com.lqp.javabasics.reflect;

/**
 * Created by lqp
 * Date: 2019/5/10
 */
public class Robot {
    private String name;
    static {
        System.out.println("Hello Static!!!");
    }
    public void sayHi(String hello)
    {
        System.out.println(hello+" "+name);
    }

    private String throwHello(String tag)
    {
        return "Hello " +tag;
    }
}

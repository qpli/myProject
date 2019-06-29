package com.lqp.javabasics.demo_classloader;

import com.lqp.javabasics.reflect.Robot;

import java.util.HashMap;

/**
 * Created by lqp
 * Date: 2019/5/10
 */
public class LoadClass  {
    public static void main(String[] args) throws Exception{
//        ClassLoader cl = Robot.class.getClassLoader();
        Class r = Class.forName("com.lqp.javabasics.reflect.Robot");

    }
}

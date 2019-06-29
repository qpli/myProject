package com.lqp.javabasics.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * Created by lqp
 * Date: 2019/5/10
 */
public class ReflectSample {
    public static void main(String[] args) throws Exception,ClassNotFoundException,IllegalAccessException,NoSuchMethodException{
        Class rc = Class.forName("com.lqp.javabasics.reflect.Robot"); //获取类
        Robot r = (Robot) rc.newInstance(); //创建类实例
        System.out.println("Class name is "+rc.getName());      //输出类名
        Method getHello = rc.getDeclaredMethod("throwHello",String.class);  //获取类中的方法
        getHello.setAccessible(true);   //因为方法是私有的，因此需要将访问设置为true
        Object str = getHello.invoke(r,"Bob");   //调用实例r的getHello方法，并传入getHello方法的参数"Bob"
        System.out.println("getHello result is "+str);     //str则为方法的返回值
        Method sayHi = rc.getMethod("sayHi", String.class);//只能获取public方法和继承实现的public方法


        Field name = rc.getDeclaredField("name");
        name.setAccessible(true);
        name.set(r,"Alice");
        Object str1 = sayHi.invoke(r,"Welcome");  //该方法没有返回值
        System.out.println("get sayHi "+str1);            //因此打印的str1为null
    }
}

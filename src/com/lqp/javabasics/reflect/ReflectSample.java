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
        Class rc = Class.forName("com.lqp.javabasics.reflect.Robot"); //��ȡ��
        Robot r = (Robot) rc.newInstance(); //������ʵ��
        System.out.println("Class name is "+rc.getName());      //�������
        Method getHello = rc.getDeclaredMethod("throwHello",String.class);  //��ȡ���еķ���
        getHello.setAccessible(true);   //��Ϊ������˽�еģ������Ҫ����������Ϊtrue
        Object str = getHello.invoke(r,"Bob");   //����ʵ��r��getHello������������getHello�����Ĳ���"Bob"
        System.out.println("getHello result is "+str);     //str��Ϊ�����ķ���ֵ
        Method sayHi = rc.getMethod("sayHi", String.class);//ֻ�ܻ�ȡpublic�����ͼ̳�ʵ�ֵ�public����


        Field name = rc.getDeclaredField("name");
        name.setAccessible(true);
        name.set(r,"Alice");
        Object str1 = sayHi.invoke(r,"Welcome");  //�÷���û�з���ֵ
        System.out.println("get sayHi "+str1);            //��˴�ӡ��str1Ϊnull
    }
}

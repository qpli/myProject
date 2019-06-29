package com.lqp.abstractAndInterface;

/**
 * Created by lqp
 * Date: 2019/5/7
 */
public class Cat extends AnanimalAbstract implements Ananimal{

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.getA(3);
    }

    @Override
    public void getA(int a) {
        System.out.println(Ananimal.a);
    }

    @Override
    public void getB(int b) {

    }


    @Override
    int getAge() {
        return 0;
    }

    @Override
    String getSex() {
        return null;
    }
}

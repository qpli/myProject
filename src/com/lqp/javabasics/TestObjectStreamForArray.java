package com.lqp.javabasics;

import java.io.*;

public class TestObjectStreamForArray {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        int[] numbers = {1,2,3,4};
        String[] s={"zhangsan","lisi","wangwu"};

        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("array.dat",true));

        output.writeObject(numbers);
        output.writeObject(s);

        output.close();

        ObjectInputStream input =new ObjectInputStream(new FileInputStream("array.dat"));

        int[] newNumbers = (int[])(input.readObject());
        String[] news = (String[])(input.readObject());

        for(int i=0;i<newNumbers.length;i++)
        {
            System.out.print(newNumbers[i]+" ");
        }
        System.out.println();

        StringBuilder a;
        String b;
        StringBuffer c;

        for(int i=0;i<news.length;i++)
        {
            System.out.print(news[i]+" ");
        }
    }
}

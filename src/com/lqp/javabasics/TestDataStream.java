package com.lqp.javabasics;

import java.io.*;
import java.util.Date;

/**
 * DataOutputStream 和 DataInputStream是一种机器无关的读写Java文件的方法，
 * 因此在一台机器上写好的文件可以在其他机器上读取。
 */
public class TestDataStream {
    public static void main(String[] args) throws Exception {
        DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
        output.writeUTF("John");
        output.writeDouble(80);

        output.close();
        DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
        System.out.println(input.readUTF()+" "+input.readDouble());
        input.close();

        /**
         * ObjectOutputStream  和 ObjectInputStream 可以读写对象，并且实现了DataOutputStream和DataInputStream的所有方法
         * 因此可以使用ObjectOutpuStream 和ObjectInputStream来替换DataInputStream和DataInputStream
         */
        ObjectOutputStream outputO = new ObjectOutputStream(new FileOutputStream("temp.dat"));
        outputO.writeObject(new Date());
        outputO.close();

        ObjectInputStream inputO = new ObjectInputStream(new FileInputStream("temp.dat"));
        System.out.println(inputO.readObject());




    }
}

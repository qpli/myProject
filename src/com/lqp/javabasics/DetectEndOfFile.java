package com.lqp.javabasics;

import java.io.*;

public class DetectEndOfFile {
    public static void main(String[] args) {
        //如果文件到达InputStream文件末尾则会抛出EOFException,借助该异常检测是否到达文件末尾

        try{
            DataOutputStream output=new DataOutputStream(new FileOutputStream("test.dat"));
            output.writeDouble(6.9);
            output.writeDouble(8.8);
            output.writeDouble(3.56);
            output.close();
            DataInputStream input = new DataInputStream(new FileInputStream("test.dat"));
            while(true)
            {
                System.out.println(input.readDouble());
            }
        }catch (EOFException e)
        {
            System.out.println("已到达文件末尾！");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

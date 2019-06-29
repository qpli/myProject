package com.lqp.javabasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
    public static void main(String[] args) throws IOException {
        File file=new File("filetestdir1/");
        System.out.println("是否存在该路径： "+file.exists());
        if(file.exists()==false)
        {
            file.mkdir();
        }
        System.out.println("文件路径为："+file.getPath());
        System.out.println("文件绝对路径为："+file.getAbsolutePath());
        System.out.println("文件绝对路径为："+file.getAbsoluteFile());
        FileOutputStream output =new FileOutputStream(file.getPath()+"/temp.dat");

        for(int i=0;i<11;i++)
        {
            output.write(i);
        }
        output.write(-1);
        output.close();

        FileInputStream input =new FileInputStream("filetestdir/temp.dat");

        int value;
        //值为-1则意味着结束
        while((value=input.read())!=-1)
        {
            System.out.println(value+" ");
        }
        input.close();
    }
}

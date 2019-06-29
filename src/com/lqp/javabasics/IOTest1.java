package com.lqp.javabasics;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOTest1 {
    public static void main(String[] args) throws Exception{
        PrintWriter output = new PrintWriter("test.txt");
        output.println("java 101");
        output.close();

        Scanner input = new Scanner(new File("test.txt"));
        System.out.println(input.nextLine());

    }

}

package com.lqp.ct;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        for(int i=2;i<=a;i++)
        {
            if(a%i==0)
            {

            }
        }

    }


    public static boolean isPrim(long num){

        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
}

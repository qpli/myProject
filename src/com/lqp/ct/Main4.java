package com.lqp.ct;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String a1=input.nextLine();
        String a2 = input.nextLine();
        int cou=0;
        int nums=0;
        if(a1.length()%8==0)
        {
            nums=nums+a1.length()/8;
        }
        else
        {
            nums = nums+a1.length()/8+1;
        }
        if(a2.length()%8==0)
        {
            nums=nums+a2.length()/8;
        }
        else
        {
            nums = nums+a2.length()/8+1;
        }
        String[] str=new String[nums];
        for(int i=0;i<a1.length();i++)
        {
            if(i%8==0)
            {
                cou=0;
            }

        }
    }
}

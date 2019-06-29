package com.lqp.easy;

import java.util.Set;

public class HanNuoTa {

    public static void main(String[] args) {

        moveDisk(4,'A','C','B');
    }

    public static void moveDisk(int n,char frompag,char topag,char auxpag)
    {

        if(n==1)
        {
            System.out.println("move the disk from "+frompag+" to "+topag);
            return;
        }
        //将frompag上的n-1个圆盘借助topag移动到auxpag
        moveDisk(n-1,frompag,auxpag,topag);
        //将第frompag上的第n个圆盘移到topag上
        System.out.println("move the disk from "+frompag+" to "+topag);
        //将auxpag上的n-1个圆盘借助frompag移到topag上
        moveDisk(n-1,auxpag,topag,frompag);

    }


}

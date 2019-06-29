package com.lqp.jianzhioffer;

/**
 * Created by lqp
 * Date: 2019/6/28
 */
import  java.util.Scanner;

public class Mian3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n==0)
        {
            System.out.println("0");
            return;
        }
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = input.nextInt();
        }

        int greatestSum = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=1;i<n;i++)
        {
            sum = sum<=0?a[i]:sum+a[i];
            greatestSum = Math.max(greatestSum,sum);
        }
        System.out.println(sum);
    }
}

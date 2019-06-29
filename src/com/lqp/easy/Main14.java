package com.lqp.easy;

/**
 * Created by lqp
 * Date: 2019/5/6
 */
public class Main14 {

    public static void main(String[] args) {
        int r = climbStairs(5);
        System.out.println(r);
    }

    public static int climbStairs(int n) {
         if(n==1)
             return 1;
         if(n==2)
             return 2;
         else{
             return climbStairs(n-1)+climbStairs(n-2);
         }
         }
}

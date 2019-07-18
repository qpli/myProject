package com.lqp.leetcodeinterview;

/**
 * Created by lqp
 * Date: 2019/7/11
 */
public class 机器人的运动范围 {


    public static void main(String[] args) {
//        int res = isEntry(35,37,18);
//        System.out.println(res);
    }

    public static boolean isEntry(int a,int b,int k){
        int res = 0;

        while(a>0){
            res = res+a%10;
            a=a/10;
        }
        while(b>0){
            res = res+b%10;
            b=b/10;
        }
//        return res;
        if(res>k)
            return false;
        return true;
    }
}

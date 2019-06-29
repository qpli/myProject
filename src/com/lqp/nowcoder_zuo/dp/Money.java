package com.lqp.nowcoder_zuo.dp;

/**
 * Created by lqp
 * Date: 2019/5/8
 */
public class Money {

    public static void main(String[] args) {
        int[] arr={5,10,25,1};
        int aim = 1000;

        int res = coins1(arr,aim);
        System.out.println(res);
    }


    /**
     * ±©Á¦µÝ¹é
     * @param arr
     * @param aim
     * @return
     */
    public static int coins1(int[] arr,int aim)
    {
        if(arr==null||arr.length==0||aim<0)
        {
            return 0;
        }
        return process1(arr,0,aim);
    }
    public static int process1(int[] arr,int index,int aim)
    {
        int res = 0;
        if(index==arr.length)
        {
            res =aim ==0?1:0;
        }else {
            for(int i=0;arr[index]*i<=aim;i++)
            {
                res+=process1(arr, index+1, aim-arr[index]*i);
            }
        }
        return res;
    }

    /**
     *
     */



}

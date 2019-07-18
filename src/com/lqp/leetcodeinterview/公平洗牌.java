package com.lqp.leetcodeinterview;

/**
 * Created by lqp
 * Date: 2019/7/17
 */
public class ¹«Æ½Ï´ÅÆ {
    public static void main(String[] args) {

        int[] a={2,3,4,5,6,7};
        shuff(a);

    }

    public static void shuff(int[] arr){
        for(int i=0;i<arr.length;i++){
           // swap(arr,i,(int)Math.random()%(i+1));
            int temp = arr[i];
            arr[i] = arr[(int)Math.random()%(i+1)];
            arr[(int)Math.random()%(i+1)] = temp;
        }


        for(int i:arr){
            System.out.println(i);
        }
    }


}

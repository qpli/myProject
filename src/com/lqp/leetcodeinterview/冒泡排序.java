package com.lqp.leetcodeinterview;

/**
 * Created by lqp
 * Date: 2019/7/14
 */
public class √∞≈›≈≈–Ú {
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,6,2,6};
        bubbleSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }

    public static void bubbleSort(int[] arr){
        boolean needNext = true;
        for(int k=1;k<arr.length&&needNext;k++){
            needNext = false;
            for(int i=0;i<arr.length-k;i++){
                if(arr[i]>arr[i+1]){
                    int temp =arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                    needNext=true;
                }
            }

        }
    }
}

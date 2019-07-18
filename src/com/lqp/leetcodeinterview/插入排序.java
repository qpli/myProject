package com.lqp.leetcodeinterview;

/**
 * Created by lqp
 * Date: 2019/7/14
 */
public class ≤Â»Î≈≈–Ú {
    public static void main(String[] args) {
        int[] arr={3,4,5,2,1,5,3};
        arr = insertSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }


    public static int[] insertSort(int[] arr){

        for(int i=1;i<arr.length;i++){
            int cur = arr[i];
            int k;
            for(k=i-1;k>=0&&arr[k]>cur;k--){
                arr[k+1]=arr[k];
            }
            arr[k+1]=cur;
        }
        return arr;
    }
}

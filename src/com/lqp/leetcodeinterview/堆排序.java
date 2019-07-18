package com.lqp.leetcodeinterview;

import java.util.PriorityQueue;

/**
 * Created by lqp
 * Date: 2019/7/18
 */
public class ∂—≈≈–Ú {

    public static void main(String[] args) {
        int[] arr = {1,4,6,6,3,3,2,5,6};

        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            p.add(arr[i]);
        }
        int i=0;
        while(!p.isEmpty()){
            arr[i] = p.poll();
            i++;
        }

        for(int j:arr){
            System.out.println(j);
        }


    }

    public static void sortHeap(int[] arr){
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            p.add(arr[i]);
        }
    }
}

package com.lqp.leetcodeinterview;

import java.util.PriorityQueue;

/**
 * Created by lqp
 * Date: 2019/7/14
 */
public class µÚK´óÔªËØ {
    public static void main(String[] args) {
        int k=3;
        int[] arr = {3,2,4,6,1,2,5};
        PriorityQueue<Integer> p = new PriorityQueue<>(k);
        for(int i=0;i<arr.length;i++){
            p.add(arr[i]);
            if(p.size()>k)
                p.poll();
        }

        System.out.println(p.poll());

    }
}

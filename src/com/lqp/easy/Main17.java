package com.lqp.easy;

/**
 * Created by lqp
 * Date: 2019/5/10
 */
public class Main17 {
    public static void main(String[] args) {

        int[] n1 = {1,2,3,0,0,0};
        int[] n2= {2,3,4};
        merge(n1,3,n2,3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m-- +n-- -1;
        System.out.println("p: "+String.valueOf(p));
        while(m>=0&&n>=0)
        {
            nums1[p--] = nums1[m]>nums2[n]? nums1[m--]:nums2[n--];
        }
        while(n>=0)
        {
            nums1[p--] = nums2[n--];
        }
    }
}

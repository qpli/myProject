package com.lqp.easy;

/**
 * Created by lqp
 * Date: 2019/5/6
 */
public class Main13 {

    public static void main(String[] args) {
        int[] a={1,2,3,0,0,7,8,0,0};
        moveZeroes(a);
//        for(int i=0;i<a.length;i++)
//        {
//            System.out.println(a[i]);
//        }
    }

    public static void moveZeroes(int[] nums) {
        int cur = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int t = nums[cur];
                nums[cur] = nums[i];
                nums[i]=t;
                cur=cur+1;
            }
        }

        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
    }
}

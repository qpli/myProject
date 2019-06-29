package com.lqp.easy;

public class Main3 {

    public static void main(String[] args)
    {
        int[] a = {1,1,1,2};
        int result = removeDuplicates(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.println("a: "+a[i]);
        }
        System.out.println(result);
    }
    public static int removeDuplicates(int[] nums) {
        int c1=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[c1])
            {
                c1=c1+1;
                int t = nums[c1];
                nums[c1]=nums[i];
                nums[i]=t;
            }
        }

        return c1;
    }

}

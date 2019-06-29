package com.lqp.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lqp
 * Date: 2019/5/6
 */
public class Main12 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }

        return false;
    }
}

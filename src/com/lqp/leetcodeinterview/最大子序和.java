package com.lqp.leetcodeinterview;

/**
 * Created by lqp
 * Date: 2019/7/14
 */
public class 最大子序和 {public int maxSubArray(int[] nums) {
    int ans = nums[0];
    int sum = 0;
    for(int num: nums) {
        if(sum > 0) {
            sum += num;
        } else {
            sum = num;
        }
        ans = Math.max(ans, sum);
    }
    return ans;
}


}

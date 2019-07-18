package com.lqp.leetcodeinterview;

/**
 * Created by lqp
 * Date: 2019/7/1
 */
public class Main2 {
    public static void main(String[] args) {
        String s = "abdbcabcasbd";
        String s1 = "abc";
        int res = s.indexOf(s1);
        System.out.println(res);
    }
    int coinChange(int[] coins, int amount) {
        if(coins==null||coins.length<1)
            return -1;
        int dp[][]=new int[coins.length][amount+1];
        //dp[i][j]是总数为j时刻,在0-i范围内任意取值,dp[i][j]=min(dp[i-1][j],dp[i][j-k*coins[i]]+k);
        for(int sum=0;sum<=amount;sum++) {
            dp[0][sum]=(sum%coins[0]==0)?sum/coins[0]:10000;
        }
        for(int index=1;index<coins.length;index++) {
            for(int sum=0;sum<=amount;sum++) {
                dp[index][sum]=dp[index-1][sum];
                int pieces=1;
                while(sum-pieces*coins[index]>=0) {
                    dp[index][sum]=Math.min(dp[index][sum], dp[index][sum-pieces*coins[index]]+pieces);
                    pieces++;
                }
            }
        }
        return dp[coins.length-1][amount]>=10000?-1:dp[coins.length-1][amount];
    }

}

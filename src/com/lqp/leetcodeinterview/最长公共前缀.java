package com.lqp.leetcodeinterview;

/**
 * Created by lqp
 * Date: 2019/7/17
 */
public class 最长公共前缀 {

    public static void main(String[] args) {
        String[] strs = {"abcbf","abcdfj","abcdsjfk"};

        int a = strs[1].indexOf(strs[0]);
        System.out.println(a);
    }

    public static String maxLongPre(String[] s){

        return null;
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)
            return "";
        String pre = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(pre)!=0)
                pre = pre.substring(0,pre.length()-1);
        }

        return pre;
    }
}

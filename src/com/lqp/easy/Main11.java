package com.lqp.easy;

/**
 * Created by lqp
 * Date: 2019/5/6
 */


public class Main11 {
    public static void main(String[] args) {

        String s = "i am , ds as. ";
        boolean t = isPalindrome(s);
    }
    public static boolean isPalindrome(String s) {
        String reg = "[^a-zA-Z]";
        s =s.replaceAll(reg,"");
        s=s.toLowerCase();
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                return false;
            }
        }
//        System.out.println(s);
        return true;
    }
}

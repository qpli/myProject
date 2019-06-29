package com.lqp.easy;

/**
 * Created by lqp
 * Date: 2019/5/7
 */
public class Main16 {

    public static void main(String[] args) {
        String[] aa={"flower","flew","flwr"};
        String re = longestCommonPrefix(aa);
        System.out.println(re);
    }

    public static String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) return "";
            String prefix = strs[0];
            for (int i = 1; i < strs.length; i++)
                while (strs[i].indexOf(prefix) != 0) {
                    System.out.println(strs[i].indexOf(prefix));
                    prefix = prefix.substring(0, prefix.length() - 1);
                    System.out.println(prefix);
                    if (prefix.isEmpty()) return "";
                }
            return prefix;
        }


}

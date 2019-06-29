package com.lqp.jianzhioffer;

import java.util.ArrayList;

/**
 * Created by lqp
 * Date: 2019/5/11
 */
public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0,1);
        a.add(0,3);
        for(int i=0;i<a.size();i++)
        System.out.println(a.get(i));
    }
    public String replaceSpace(StringBuffer str) {
        int len = str.length();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
                len=len+2;
        }

        StringBuilder s = new StringBuilder();
        int c= 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                s.append("%20");
            }
            else
                s.append(str.charAt(i));
        }
        return s.toString();
    }
}

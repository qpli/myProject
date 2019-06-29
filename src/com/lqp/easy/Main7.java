package com.lqp.easy;

public class Main7 {

    public static void main(String[] args)
    {
        int[] a={1,2,3};
        a=plusOne(a);
        for(int i=0;i<a.length;i++) {
            System.out.println("a" + a[i]);
        }
    }

    public static int[] plusOne(int[] digits) {

        StringBuilder s=new StringBuilder();
        for(int i=0;i<digits.length;i++)
        {
            s.append(Integer.toString(digits[i]));
        }
        int a = Integer.parseInt(s+"")+1;
        s=new StringBuilder("");
        s=s.append(""+a);
        int[] result = new int[digits.length];
        for(int i=0;i<s.length();i++)
        {
            result[i] = Integer.parseInt(""+s.charAt(i));
        }
        return result;
    }

}

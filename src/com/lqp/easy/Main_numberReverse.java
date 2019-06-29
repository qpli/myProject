package com.lqp.easy;

public class Main_numberReverse {


    public int reverse(int x) {
        String s=Integer.toString(x);
        char[] result=new char[s.length()];
        if(s.charAt(0)=='-')
        {
            int a=1;
            result[0]='-';
            for(int i=a;i<s.length();i++)
            {
                result[i] = s.charAt(s.length()-i);
            }
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                result[i] = s.charAt(s.length()-1-i);
            }
        }
        try {
            int aa = Integer.parseInt(String.valueOf(result));
            return aa;
        }catch (Exception e)
        {
            return 0;
        }

    }

}

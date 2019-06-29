package com.lqp.easy;

public class Main4 {
    public static void main(String[] args)
    {
        int result = strStr("mississippi","issip");
        System.out.println("result: "+result+" "+"".length());
    }
    public static int strStr(String haystack, String needle) {
        if(needle.length()==0)
        { return 0;}
        if(needle.length()>haystack.length())
        {return -1;}

        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                if(needle.length()>haystack.length()-i) {
                    // System.out.println("1");
                    return -1;
                }
                int j=-1;
                for(j=1;j<needle.length();j++)
                {
                    if(haystack.charAt(i+j)!=needle.charAt(j)) {
                        // System.out.println("2");
                        break;
                    }
                }
                if(j==needle.length())
                {
                    return i;
                }
            }
        }
        return -1;

    }
}

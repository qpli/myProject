package com.lqp.easy;

public class Main5 {

    public static void main(String[] args)
    {
        String s2="1";


        String s1 =new String( countAndSay(4));
        System.out.println("s1:"+s1);
    }

    public static String countAndSay(int n) {

        if(n==1)
            return "1";
        if(n==2)
            return "11";
        else {

            StringBuilder s1 = new StringBuilder("11");
            StringBuilder s2 = new StringBuilder();
            for (int i = 1; i < n-1; i++) {
                s2 = returnNext(s1);
                System.out.println("s2:" + s2);
                s1 = s2;
            }
            return s2 + "";
        }
    }
    public static StringBuilder returnNext(StringBuilder s)
    {
        int cou=1;
        char cur=s.charAt(0);
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==cur)
            {
                cou=cou+1;
            }
            else
            {
                sb.append(Integer.toString(cou)+cur);
                cou=1;
                cur=s.charAt(i);
            }
        }
        StringBuilder ss = sb.append(Integer.toString(cou)+cur);
        sb=new StringBuilder();
        return ss;
    }
}

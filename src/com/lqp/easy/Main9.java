package com.lqp.easy;

public class Main9 {
static final int  a=100;
    public static void main(String[] args)
    {
        String re=addBinary("1010","1011");
        System.out.println("re: "+re);
    }


    public static  String addBinary(String a, String b) {
        int len=0;

        if(a.length()>b.length())
        {
            len=a.length();
            int n = len-b.length();
            char[] tt = new char[n];
            for(int i=0;i<n;i++)
                tt[i]='0';
            b=String.valueOf(tt)+b;
          //  System.out.println("b"+b);

        }
        if(a.length()<b.length()){
            len=b.length();
            int n = len-a.length();
            char[] tt = new char[n];
            for(int i=0;i<n;i++)
                tt[i]='0';
            a=String.valueOf(tt)+a;
            //a="0{n}"+a;
            //System.out.println("a"+a);
        }
        else
        {
            len = a.length();
        }

        System.out.println("a"+a);
        System.out.println("b"+b);
        StringBuilder result = new StringBuilder("0");
        int cur=0;
        for(int i=0;i<len;i++)
        {
           // a.charAt(a.length()-1-i);
            int a1 = Integer.parseInt(""+a.charAt(a.length()-1-i));
            int b1=Integer.parseInt(""+b.charAt(b.length()-1-i));
            int c=0;
            if(result.length()>i) {
                c = a1 + b1 + Integer.parseInt("" + result.charAt(0));
            }
           else c=a1+b1;
            if(c==0)
            {
                if(result.length()>i)
                result.deleteCharAt(0);
                result.insert(0,'0');
                cur=cur;
            }
            if(c==1)
            {
               if(result.length()>i)
                result.deleteCharAt(0);
                result.insert(0,'1');
                cur=cur;
            }
            if(c==2)
            {
                if(result.length()>i)
                result.deleteCharAt(0);
                result.insert(0,"10");
                cur=cur+1;
            }
            if(c==3)
            {
               if(result.length()>i)
                result.deleteCharAt(0);
                result.insert(0,"11");
                cur=cur+1;
            }
        }


            return result+"";




    }


}

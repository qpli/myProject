package com.lqp.easy;

public class Main {
    public static void main(String[] args)
    {

        int result= romanToInt("III");


    }


    public static int romanToInt(String s) {
        int a=0;//当前数字
        int last=0;//上一个数字
        int result=0;

        for(int i=s.length()-1;i>=0;i--){

            switch(s.charAt(i)){
                case 'I':a=1;break;
                case 'V':a=5;break;
                case 'X':a=10;break;
                case 'L':a=50;break;
                case 'C':a=100;break;
                case 'D':a=500;break;
                case 'M':a=1000;break;
            }

            if(a>=last){
                result=result+a;
            }else{
                result=result-a;
            }
            last=a;
        }
        return result;
    }




}

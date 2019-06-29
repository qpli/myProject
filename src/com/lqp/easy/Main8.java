package com.lqp.easy;

public class Main8 {
    public static void main(String[] args)
    {
        int[] b=plusOne(new int[]{1,9});
        for(int i=0;i<b.length;i++) {
            System.out.println("result: " + b[i]);
        }
    }
    public static int[] plusOne(int[] digits) {

        for(int i=digits.length-1;i>0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]=i+1;
                return digits;
            }
            else{
                digits[i]=0;
                digits[i-1]=digits[i-1]+1;

            }
        }
        return digits;
    }
}

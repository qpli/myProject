package com.lqp.ct;

import java.util.Scanner;

/**
 *
 * 题目描述
 * 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 *
 * 输入描述:
 * 输入一个有字母和数字以及空格组成的字符串，和一个字符。
 *
 * 输出描述:
 * 输出输入字符串中含有该字符的个数。
 *
 * 示例1
 * 输入
 * 复制
 * ABCDEF A
 * 输出
 * 复制
 * 1
 */
public class Main2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str=input.nextLine();
        String s = input.next();
        str=str.toLowerCase();
        s=s.toLowerCase();
//        char c = str.charAt(str.length()-1);
        int cou=0;
//        System.out.println("字符串长度"+str.length()+" 结果 "+cou);
        for(int i=0;i<str.length();i++)
        {
            if(String.valueOf(str.charAt(i)).equals(s))
            {
               cou=cou+1;
            }
        }

        System.out.println("字符串长度"+str.length()+" 结果 "+cou);
    }
}

package com.lqp.ct;

import java.util.Scanner;

/**
 *
 * ��Ŀ����
 * д��һ�����򣬽���һ������ĸ��������ɵ��ַ�������һ���ַ���Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд��
 *
 * ��������:
 * ����һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���
 *
 * �������:
 * ��������ַ����к��и��ַ��ĸ�����
 *
 * ʾ��1
 * ����
 * ����
 * ABCDEF A
 * ���
 * ����
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
//        System.out.println("�ַ�������"+str.length()+" ��� "+cou);
        for(int i=0;i<str.length();i++)
        {
            if(String.valueOf(str.charAt(i)).equals(s))
            {
               cou=cou+1;
            }
        }

        System.out.println("�ַ�������"+str.length()+" ��� "+cou);
    }
}

package com.lqp.ct;

import java.util.Scanner;

/**
 * ţ�ͻ�Ϊ����
 *
 * ��Ŀ����
 * �����ַ������һ�����ʵĳ��ȣ������Կո������
 * ��������:
 * һ���ַ������ǿգ�����С��5000��
 *
 * �������:
 * ����N�����һ�����ʵĳ��ȡ�
 */
public class Main1 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String str = input.nextLine();
       String[] arr = str.split(" ");
       int result = arr[arr.length-1].length();
       System.out.println(""+result);

    }
}

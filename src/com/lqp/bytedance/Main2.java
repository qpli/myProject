package com.lqp.bytedance;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by lqp
 * Date: 2019/6/29
 * С����һ���㷨����ʦ��ͬʱҲ��һ����ʺ�١�ĳ�죬��ͻ�����룬���è�����Ƶ���ھ�һЩè����˶���Ϣ��Ϊ����ȡ�˶���Ϣ������Ҫ����Ƶ��ÿһ֡��ȡ��è����������һ��è��������һ����ά��vector<x, y>�����x_1=x_2 and y_1=y_2����ô������ͬһ��������
 *        ��ˣ����������������һ�£�������Ϊ�������˶���Ҳ����˵���������<a, b>�ڳ���֡����֣���ô�������������˶������磬����<a, b>�ڵ�2/3/4/7/8֡���֣���ô���������γ����������˶�2-3-4 ��7-8��
 * ���ڣ�����ÿһ֡���������������������ܲ�һ����С���������ҵ���������˶���
 */
public class Main2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //��һ�У�֡��
        for(int count=0; count<n; count++) {   //��������ÿһ֡������
            int m = sc.nextInt();     //��i֡����������
            String s = sc.nextLine();   //��i֡������
            HashMap<String, Integer> preMap = new HashMap<>();
            int res = 0;
            for(int i=0; i<m; i++) {
                s = sc.nextLine();
                String[] ss = s.split("\\ ");

                int nn = Integer.parseInt(ss[0]);
                HashMap<String, Integer> map = new HashMap<>();
                for(int j=1; j<ss.length; j+=2) {
                    String t1 = ss[j];
                    String t2 = ss[j+1];
                    String ts = t1 + " " + t2;
                    int tc = 1;
                    if(preMap.containsKey(ts)) {
                        tc = preMap.get(ts) + 1;
                    }
                    if(tc > res) {
                        res = tc;
                    }
                    map.put(ts, tc);
                }
                preMap = map;
            }
            System.out.println(res);
        }
    }
}

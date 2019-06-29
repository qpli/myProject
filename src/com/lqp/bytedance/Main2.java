package com.lqp.bytedance;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by lqp
 * Date: 2019/6/29
 * 小明是一名算法工程师，同时也是一名铲屎官。某天，他突发奇想，想从猫咪的视频里挖掘一些猫咪的运动信息。为了提取运动信息，他需要从视频的每一帧提取“猫咪特征”。一个猫咪特征是一个两维的vector<x, y>。如果x_1=x_2 and y_1=y_2，那么这俩是同一个特征。
 *        因此，如果喵咪特征连续一致，可以认为喵咪在运动。也就是说，如果特征<a, b>在持续帧里出现，那么它将构成特征运动。比如，特征<a, b>在第2/3/4/7/8帧出现，那么该特征将形成两个特征运动2-3-4 和7-8。
 * 现在，给定每一帧的特征，特征的数量可能不一样。小明期望能找到最长的特征运动。
 */
public class Main2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //第一行，帧数
        for(int count=0; count<n; count++) {   //连续输入每一帧的特征
            int m = sc.nextInt();     //第i帧的特征个数
            String s = sc.nextLine();   //第i帧的特征
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

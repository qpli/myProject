package com.lqp.bytedance;

import java.util.Scanner;

/**
 * Created by lqp
 * Date: 2019/6/30
 * 为了不断优化推荐效果，今日头条每天要存储和处理海量数据。假设有这样一种场景：我们对用户按照它们的注册时间先后来标号，对于一类文章，每个用户都有不同的喜好值，我们会想知道某一段时间内注册的用户（标号相连的一批用户）中，有多少用户对这类文章喜好值为k。因为一些特殊的原因，不会出现一个查询的用户区间完全覆盖另一个查询的用户区间(不存在L1<=L2<=R2<=R1)。
 *
 *
 *
 * 输入描述:
 * 输入： 第1行为n代表用户的个数 第2行为n个整数，第i个代表用户标号为i的用户对某类文章的喜好度 第3行为一个正整数q代表查询的组数  第4行到第（3+q）行，每行包含3个整数l,r,k代表一组查询，即标号为l<=i<=r的用户中对这类文章喜好值为k的用户的个数。 数据范围n <= 300000,q<=300000 k是整型
 *
 * 输出描述:
 * 输出：一共q行，每行一个整数代表喜好值为k的用户的个数
 *
 * 输入例子1:
 * 5
 * 1 2 3 3 5
 * 3
 * 1 2 1
 * 2 4 5
 * 3 5 3
 *
 * 输出例子1:
 * 1
 * 0
 * 2
 *
 * 例子说明1:
 * 样例解释:
 * 有5个用户，喜好值为分别为1、2、3、3、5，
 * 第一组询问对于标号[1,2]的用户喜好值为1的用户的个数是1
 * 第二组询问对于标号[2,4]的用户喜好值为5的用户的个数是0
 * 第三组询问对于标号[3,5]的用户喜好值为3的用户的个数是2
 */
public class Main3 {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++)
        {
            a[i] = input.nextInt();
        }

        int zs = input.nextInt();
        int[][] fz_detail = new int[zs][3];
        for(int i=0;i<fz_detail.length;i++)
        {
            for(int j=0;j<fz_detail[0].length;j++)
            {
                fz_detail[i][j] = input.nextInt();
            }
        }

//        int n = 5;
//        int[] a= {1,2,3,3,5};
//        int zs = 3;
//        int[][] fz_detzil = {{1,2,1},{2,4,5},{3,5,3}};

        int[] res = userHobby(n,a,zs,fz_detail);
        for(int r:res)
        {
            System.out.println(r);
        }

    }

    /**
     *
     * @param n   用户个数
     * @param a   用户得分
     * @param zs  分组数
     * @param fz_detail  分组数详情：起始编号，结束编号，K值
     * @return   用户在起始编号-结束编号之间得分为K的个数。
     */
    public static int[] userHobby(int n,int[] a,int zs,int[][] fz_detail){
        int[]  res = new int[zs];
        for(int i=0;i<res.length;i++)
        {
            res[i]=0;
        }
        for(int i = 0;i<zs;i++)
        {
            for(int j =fz_detail[i][0]-1;j<fz_detail[i][1];j++)
            {
                if(a[j]==fz_detail[i][2])
                    res[i]++;
            }
        }

        return res;
    }



}

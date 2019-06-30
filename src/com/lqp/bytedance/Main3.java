package com.lqp.bytedance;

import java.util.Scanner;

/**
 * Created by lqp
 * Date: 2019/6/30
 * Ϊ�˲����Ż��Ƽ�Ч��������ͷ��ÿ��Ҫ�洢�ʹ��������ݡ�����������һ�ֳ��������Ƕ��û��������ǵ�ע��ʱ���Ⱥ�����ţ�����һ�����£�ÿ���û����в�ͬ��ϲ��ֵ�����ǻ���֪��ĳһ��ʱ����ע����û������������һ���û����У��ж����û�����������ϲ��ֵΪk����ΪһЩ�����ԭ�򣬲������һ����ѯ���û�������ȫ������һ����ѯ���û�����(������L1<=L2<=R2<=R1)��
 *
 *
 *
 * ��������:
 * ���룺 ��1��Ϊn�����û��ĸ��� ��2��Ϊn����������i�������û����Ϊi���û���ĳ�����µ�ϲ�ö� ��3��Ϊһ��������q�����ѯ������  ��4�е��ڣ�3+q���У�ÿ�а���3������l,r,k����һ���ѯ�������Ϊl<=i<=r���û��ж���������ϲ��ֵΪk���û��ĸ����� ���ݷ�Χn <= 300000,q<=300000 k������
 *
 * �������:
 * �����һ��q�У�ÿ��һ����������ϲ��ֵΪk���û��ĸ���
 *
 * ��������1:
 * 5
 * 1 2 3 3 5
 * 3
 * 1 2 1
 * 2 4 5
 * 3 5 3
 *
 * �������1:
 * 1
 * 0
 * 2
 *
 * ����˵��1:
 * ��������:
 * ��5���û���ϲ��ֵΪ�ֱ�Ϊ1��2��3��3��5��
 * ��һ��ѯ�ʶ��ڱ��[1,2]���û�ϲ��ֵΪ1���û��ĸ�����1
 * �ڶ���ѯ�ʶ��ڱ��[2,4]���û�ϲ��ֵΪ5���û��ĸ�����0
 * ������ѯ�ʶ��ڱ��[3,5]���û�ϲ��ֵΪ3���û��ĸ�����2
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
     * @param n   �û�����
     * @param a   �û��÷�
     * @param zs  ������
     * @param fz_detail  ���������飺��ʼ��ţ�������ţ�Kֵ
     * @return   �û�����ʼ���-�������֮��÷�ΪK�ĸ�����
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

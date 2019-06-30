package com.lqp.bytedance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lqp
 * Date: 2019/6/30
 * ��Ϊһ���ִ����ˣ��н������㶩����һ������n����ɫ������ִ�����ÿ������Ҫô��ɫ��ҪôͿ����������ɫ��Ϊ��ʹ�ִ���ɫ�ʿ���������ô����������Ҫ���ִ��ϵ�����һ����ɫ����������ɫ����������������m���������������һ�Σ�ע�������ִ���һ�����Σ����ִ��ϵ���ɫһ����c�֡����ڰ�˳ʱ���������n��������ִ��ϣ�ÿ������������������ɫ�ֱ�����Щ�������жϸ��ִ����ж�������ɫ������Ҫ�󡣼�ѯ���ж�������ɫ����������m�������г������������Ρ�
 *
 *
 * ��������:
 * ��һ������n��m��c���������ÿո������(1 <= n <= 10000, 1 <= m <= 1000, 1 <= c <= 50) ������n��ÿ�еĵ�һ����num_i(0 <= num_i <= c)��ʾ��i�������ж�������ɫ�����������ζ���num_i�����֣�ÿ������x��ʾ��i�������ϰ�����x����ɫ(1 <= x <= c)
 *
 * �������:
 * һ���Ǹ���������ʾ���������ж�������ɫ��������
 *
 * ��������1:
 * 5 2 3
 * 3 1 2 3
 * 0
 * 2 2 3
 * 1 2
 * 1 3
 *
 * �������1:
 * 2
 *
 * ����˵��1:
 * ��һ����ɫ�����ڵ�1�Ŵ��飬������޳�ͻ��
 * �ڶ�����ɫ�ֱ�����ڵ� 1��3��4�Ŵ��飬��3�����4�Ŵ������ڣ����Բ���Ҫ��
 * ��������ɫ�ֱ�����ڵ�1��3��5�Ŵ��飬��5�Ŵ������һ���ǵ�1�ţ����Բ���Ҫ��
 * �ܼ���2����ɫ�ķֲ���������ġ�
 * �����2�Ŵ�����͸���ġ�
 */
public class Main4 {



    public static int[] reColor(int n, int m, int c, List color){

        return null;
    }

    private static boolean IsVaild(ArrayList<Integer> a, int m, int n){
        if(a.size() == 0){
            return true;
        }
        boolean flag = true;
        for (int i = 0; i < a.size() - 1; ++i){
            if((a.get(i+1) - a.get(i)) < m){
                flag = false;
                break;
            }
        }
        int mLast = a.get(0) - (a.get(a.size() - 1) - n);
        if(mLast < m){
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // �������
        int m = scanner.nextInt(); // ���
        int c = scanner.nextInt(); // ��ɫ����
        int[][] clist = new int[n][];
        for(int i = 0; i < n ;++i){
            int cNumber = scanner.nextInt();
            clist[i] = new int[cNumber];
            for (int j = 0; j < cNumber; ++ j){
                clist[i][j] = scanner.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i <= c; i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j =0 ;j < n; ++j){
                for(int k = 0; k<clist[j].length; ++k){
                    if(clist[j][k] == i){
                        temp.add(j);
                    }
                }
            }
            if(!IsVaild(temp, m, n)){
                count++;
            }
        }
        System.out.println(count);
    }


}

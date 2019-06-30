package com.lqp.bytedance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by lqp
 * Date: 2019/6/30
 *
 * * Ϊ�˲����Ż��Ƽ�Ч��������ͷ��ÿ��Ҫ�洢�ʹ��������ݡ�����������һ�ֳ��������Ƕ��û��������ǵ�ע��ʱ���Ⱥ�����ţ�����һ�����£�ÿ���û����в�ͬ��ϲ��ֵ�����ǻ���֪��ĳһ��ʱ����ע����û������������һ���û����У��ж����û�����������ϲ��ֵΪk����ΪһЩ�����ԭ�򣬲������һ����ѯ���û�������ȫ������һ����ѯ���û�����(������L1<=L2<=R2<=R1)��
 *  *
 *  *
 *  *
 *  * ��������:
 *  * ���룺 ��1��Ϊn�����û��ĸ��� ��2��Ϊn����������i�������û����Ϊi���û���ĳ�����µ�ϲ�ö� ��3��Ϊһ��������q�����ѯ������  ��4�е��ڣ�3+q���У�ÿ�а���3������l,r,k����һ���ѯ�������Ϊl<=i<=r���û��ж���������ϲ��ֵΪk���û��ĸ����� ���ݷ�Χn <= 300000,q<=300000 k������
 *  *
 *  * �������:
 *  * �����һ��q�У�ÿ��һ����������ϲ��ֵΪk���û��ĸ���
 *  *
 *  * ��������1:
 *  * 5
 *  * 1 2 3 3 5
 *  * 3
 *  * 1 2 1
 *  * 2 4 5
 *  * 3 5 3
 *  *
 *  * �������1:
 *  * 1
 *  * 0
 *  * 2
 *  *
 *  * ����˵��1:
 *  * ��������:
 *  * ��5���û���ϲ��ֵΪ�ֱ�Ϊ1��2��3��3��5��
 *  * ��һ��ѯ�ʶ��ڱ��[1,2]���û�ϲ��ֵΪ1���û��ĸ�����1
 *  * �ڶ���ѯ�ʶ��ڱ��[2,4]���û�ϲ��ֵΪ5���û��ĸ�����0
 *  * ������ѯ�ʶ��ڱ��[3,5]���û�ϲ��ֵΪ3���û��ĸ�����2
 */
public class UserHobby {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();//������
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
            //��¼����ϲ��ֵ��Ӧ�û���id���浽map�У��û�id���浽ArrayList��
            for (int i = 0; i < n; i++) {
                int cur = scanner.nextInt();
                ArrayList<Integer> list = map.getOrDefault(cur, new ArrayList<>());
                list.add(i);
                map.put(cur, list);
            }
            int times = scanner.nextInt();//��¼��ѯ����
            for (int i = 0; i < times; i++) {
                int count = 0;//��¼�û�����
                int start = scanner.nextInt();
                int end = scanner.nextInt();
                int target = scanner.nextInt();
                ArrayList<Integer> list = map.get(target);
                if (list == null) {
                    System.out.println(0);
                } else {
                    for (int a :
                            list) {
                        if (a + 1 >= start && a + 1 <= end) {//�û�id��������
                            count++;
                        }
                    }
                    System.out.println(count);
                }
            }
        }

}

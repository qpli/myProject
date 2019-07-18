package com.lqp.leetcodeinterview;

import java.util.LinkedList;

/**
 * Created by lqp
 * Date: 2019/7/2
 */
public class SlidingWindows {
    public static void main(String[] args) {

    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length < 2) return nums;
        // ˫����� ���浱ǰ�������ֵ������λ�� ��֤����������λ�õ���ֵ���Ӵ�С����
        LinkedList<Integer> queue = new LinkedList();
        // �������
        int[] result = new int[nums.length-k+1];
        // ����nums����
        for(int i = 0;i < nums.length;i++){
            // ��֤�Ӵ�С ���ǰ����С����Ҫ���ε�����ֱ������Ҫ��
            while(!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]){
                queue.pollLast();
            }
            // ��ӵ�ǰֵ��Ӧ�������±�
            queue.addLast(i);
            // �жϵ�ǰ�����ж��׵�ֵ�Ƿ���Ч
            if(queue.peek() <= i-k){
                queue.poll();
            }
            // �����ڳ���Ϊkʱ ���浱ǰ���������ֵ
            if(i+1 >= k){
                result[i+1-k] = nums[queue.peek()];
            }
        }
        return result;
    }

}

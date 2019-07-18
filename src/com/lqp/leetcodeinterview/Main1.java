package com.lqp.leetcodeinterview;

import com.sun.source.tree.Tree;

import java.util.*;

/**
 * Created by lqp
 * Date: 2019/6/30
 * Line 14: error: ';' expected
 *         for(int i=1:i<res.length;i++)
 *                    ^
 * Line 14: error: ';' expected
 *         for(int i=1:i<res.length;i++)
 *                     ^
 * Line 14: error: > expected
 *         for(int i=1:i<res.length;i++)
 *                                 ^
 * Line 14: error: ')' expected
 *         for(int i=1:i<res.length;i++)
 *                                  ^
 * Line 14: error: illegal start of expression
 *         for(int i=1:i<res.length;i++)
 *                                     ^
 * 5 errors
 */
public class Main1 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};

        int k=2;
        List list = Main1.topKFrequent(nums,k);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }

    public static List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>()
        {
            public int compare(Integer a, Integer b)
            {
                return map.get(a) - map.get(b);
            }
        });
        for (int key : map.keySet())
        {
            if (pq.size() < k)
                pq.add(key);
            else if (map.get(key) > map.get(pq.peek()))
            {
                pq.remove();
                pq.add(key);
            }
        }
        List<Integer> res = new ArrayList<>();
        while (!pq.isEmpty())
        {
            res.add(pq.remove());
        }
        return res;
    }

}

package com.lqp.mytest;

import java.util.*;

/**
 * Created by lqp
 * Date: 2019/5/10
 */
public class Main1 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int result=addArray(a,0,a.length-1);
        System.out.println(result);
        System.out.println(findMax(a,0,a.length-1));
        sort(a,0,a.length-1);
        for(int aa:a)
        {
            System.out.println(aa);
        }

        ///!!!!!!Map是一对一的映射，不能一对多，需要自己定义数据结构
        Map<String, Queue<String>> map = new HashMap<>();

    }

    public static int addArray(int[] a,int start,int end)
    {
        if(a==null||a.length==0)
            return 0;
        if(start==end)
            return a[start];
        return a[start]+addArray(a,++start,end);
    }

    public static int findMax(int[] a,int start,int stop)
    {
        if(a==null||a.length==0)
            return 0;
        if(start==stop)
            return a[start];
        return Math.max(a[start],findMax(a,++start,stop));
    }


    public static int quickSort(int[] a,int low,int high)
    {
        int key = a[low];
        while (low<high)
        {
            while (a[high]>=key&&high>low)
            {
                high--;
            }
            a[low] = a[high];
            while (a[low]<=key&&high>low)
            {
                low++;
            }
            a[high]=a[low];
        }
        a[high] = key;
        return high;
    }

    public static void sort(int[] a,int low,int high)
    {
        if(low>=high)
        {
            return ;
        }
        int index = quickSort(a,low,high);
        sort(a,low,index-1);
        sort(a,index+1,high);
    }

}

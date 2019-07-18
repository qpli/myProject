package com.lqp.leetcodeinterview;

/**
 * Created by lqp
 * Date: 2019/7/14
 */


public class øÏÀŸ≈≈–Ú {
    public static void main(String[] args) {
        int[] arr = {3,4,6,2,2,1,4,2,5,8,4};
        quickSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }

    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    public static void quickSort(int[] arr,int first,int last){
        if(first<last){
            int pivotIndex = pivotIndex(arr,first,last);
            quickSort(arr,first,pivotIndex-1);
            quickSort(arr,pivotIndex+1,last);
        }
    }

    public static int pivotIndex(int[] arr,int first,int last){
        int pivot = arr[first];
        int low=first+1;
        int high = last;
        while(low<high){
            while(low<=high&&arr[low]<=pivot)
                low++;
            while(low<=high&&arr[high]>pivot)
                high--;
            if(low<high){
                int temp = arr[high];
                arr[high] = arr[low];
                arr[low] = temp;
            }
        }

        while(high>first&&arr[high]>=pivot)
            high--;
        if(high>first){
            arr[first] = arr[high];
            arr[high] = pivot;
            return high;
        }else {
            return first;
        }
    }
}

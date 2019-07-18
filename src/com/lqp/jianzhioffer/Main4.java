package com.lqp.jianzhioffer;

import java.util.LinkedList;

/**
 * Created by lqp
 * Date: 2019/7/4
 */
public class Main4 {
    public static void main(String[] args) {
        int[][] a = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target = 10;
        Find(target,a);

    }
    public static boolean Find(int target, int [][] array) {
        if(array==null||array.length==0||array[0].length==0)
            return false;
        for(int i=0,j=array[0].length-1;i<array.length&&j>=0;){
            if(target==array[i][j])
                return true;
            else if(target>array[i][j])
                i++;
            else{
                 j--;}
        }
        LinkedList<Integer> list = new LinkedList<>();

        return false;
    }
}

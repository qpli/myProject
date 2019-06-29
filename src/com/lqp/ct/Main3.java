package com.lqp.ct;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int num = input.nextInt();
            int[] nums = new int[num];
            int[] result = new int[num];
            HashSet hashSet = new HashSet();
            int cou = 0;
            for (int i = 0; i < num; i++) {
                nums[i] = input.nextInt();
                if (!hashSet.contains(nums[i])) {
                    hashSet.add(nums[i]);
                    result[cou] = nums[i];
                    cou = cou + 1;
                }
            }
            for (int i = 0; i < cou; i++) {
                for (int j = i; j < cou; j++) {
                    if (result[j] < result[i]) {
                        int t = result[j];
                        result[j] = result[i];
                        result[i] = t;
                    }
                }
            }

            for (int i = 0; i < cou; i++) {
                System.out.println(result[i]);
            }
        }
    }
}

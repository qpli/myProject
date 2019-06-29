package com.lqp.bytedance;
import java.util.HashMap;
import java.util.Scanner;
/**
 * Created by lqp
 * Date: 2019/6/29
 */
public class Main1 {
        public static boolean energy(int[] arr, int energy) {
            for (int i = 0; i < arr.length; i++) {
                if (energy >= arr[i]) {
                    int num = energy - arr[i];
                    if (energy + num < 0) return true;
                    energy += num;
                } else {
                    energy -= arr[i] - energy;
                    if (energy < 0) return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int i = 0, j = Integer.MAX_VALUE;
            while (i < j) {
                int mid = i + (j - i) / 2;
                if (energy(arr, mid)) {
                    j = mid;
                } else {
                    i = mid + 1;
                }
            }
            System.out.println(i);
        }

}

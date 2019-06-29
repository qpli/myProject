package com.lqp.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main10 {
    public int lengthOfLongestSubstring(String s) {
        int[] cou1 = new int[s.length()];
        for (int k = 0; k < s.length(); k++) {
            HashSet map = new HashSet();

            int cou = 0;
            for (int i = 0; i < s.length(); i++) {
                if (map.contains(s.charAt(i))) {
                    cou1[k] = cou;
                    break;
                } else {
                    map.add(s.charAt(i));
                    cou = cou + 1;
                }
            }
            cou1[k] = cou;
        }
        int result=cou1[0];
        for(int i=1;i<cou1.length;i++)
        {
            if(result<cou1[i]) {
                result =cou1[i];
            }
        }

        return result;
    }
}

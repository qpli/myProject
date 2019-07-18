package com.lqp.leetcodeinterview;

import java.util.Stack;

/**
 * Created by lqp
 * Date: 2019/7/14
 */
public class ¼ÆËãÆ÷ {
    public int calculate(String s) {
        int res = 0;
        int num = 0;
        char sign = '+';
        Stack<Integer> stack = new Stack<>();
        char[] sarr = s.toCharArray();
        for (int i = 0; i < sarr.length; i++) {
            if (sarr[i] >= '0') {
                num = num * 10 + sarr[i] - '0';
            }
            if ((sarr[i] < '0' && sarr[i] != ' ') || i == sarr.length - 1) {
                if (sign == '+') {
                    stack.push(num);
                } else if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '*' || sign == '/') {
                    int top = stack.pop();
                    stack.push(sign == '*' ? top * num : top / num);
                }
                sign = sarr[i];
                num = 0;
            }
        }
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;

    }
}

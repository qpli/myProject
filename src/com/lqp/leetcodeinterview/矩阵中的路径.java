package com.lqp.leetcodeinterview;

/**
 * Created by lqp
 * Date: 2019/7/11
 */
public class 矩阵中的路径 {

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        int flag[] = new int[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (helper(matrix, rows, cols, i, j, str, 0, flag))
                    return true;
            }
        }
        return false;
    }

    /**
     *
     * @param matrix  字符矩阵，存储到一个向量中
     * @param rows    行数
     * @param cols    列数
     * @param i       当前访问的行号
     * @param j       当前访问的列号
     * @param str     需要遍历的字符串
     * @param k       需要遍历的字符串的第K个字符，从0开始
     * @param flag    标记是否已经访问过，大小同matrix
     * @return
     */
    private boolean helper(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {
        int index = i * cols + j;//当前遍历的matrix下标
        //判断边界条件
        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[index] != str[k] || flag[index] == 1)
            return false;
        //如果已经遍历完所有的str，则返回true
        if(k == str.length - 1) return true;
        //将当前已经遍历过的标志位置为true
        flag[index] = 1;
        //判断当前位置是否满足条件
        if (helper(matrix, rows, cols, i - 1, j, str, k + 1, flag)
                || helper(matrix, rows, cols, i + 1, j, str, k + 1, flag)
                || helper(matrix, rows, cols, i, j - 1, str, k + 1, flag)
                || helper(matrix, rows, cols, i, j + 1, str, k + 1, flag)) {
            return true;
        }
        //不满足则将标志位恢复为false
        flag[index] = 0;
        return false;
    }
}

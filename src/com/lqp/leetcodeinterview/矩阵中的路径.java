package com.lqp.leetcodeinterview;

/**
 * Created by lqp
 * Date: 2019/7/11
 */
public class �����е�·�� {

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
     * @param matrix  �ַ����󣬴洢��һ��������
     * @param rows    ����
     * @param cols    ����
     * @param i       ��ǰ���ʵ��к�
     * @param j       ��ǰ���ʵ��к�
     * @param str     ��Ҫ�������ַ���
     * @param k       ��Ҫ�������ַ����ĵ�K���ַ�����0��ʼ
     * @param flag    ����Ƿ��Ѿ����ʹ�����Сͬmatrix
     * @return
     */
    private boolean helper(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {
        int index = i * cols + j;//��ǰ������matrix�±�
        //�жϱ߽�����
        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[index] != str[k] || flag[index] == 1)
            return false;
        //����Ѿ����������е�str���򷵻�true
        if(k == str.length - 1) return true;
        //����ǰ�Ѿ��������ı�־λ��Ϊtrue
        flag[index] = 1;
        //�жϵ�ǰλ���Ƿ���������
        if (helper(matrix, rows, cols, i - 1, j, str, k + 1, flag)
                || helper(matrix, rows, cols, i + 1, j, str, k + 1, flag)
                || helper(matrix, rows, cols, i, j - 1, str, k + 1, flag)
                || helper(matrix, rows, cols, i, j + 1, str, k + 1, flag)) {
            return true;
        }
        //�������򽫱�־λ�ָ�Ϊfalse
        flag[index] = 0;
        return false;
    }
}

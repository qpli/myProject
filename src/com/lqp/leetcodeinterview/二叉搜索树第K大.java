package com.lqp.leetcodeinterview;

/**
 * Created by lqp
 * Date: 2019/7/11
 */
public class ������������K�� {

    public static void main(String[] args) {

    }


    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }
    public static int index = 0; //������
    public static TreeNode KthNode(TreeNode root, int k)
    {
        if(root != null){ //�������Ѱ�ҵ�k��
            TreeNode node = KthNode(root.left,k);
            if(node != null)
                return node;
            index ++;
            if(index == k)
                return root;
            node = KthNode(root.right,k);
            if(node != null)
                return node;
        }
        return null;
    }
}

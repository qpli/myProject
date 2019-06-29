package com.lqp.easy;

/**
 * Created by lqp
 * Date: 2019/5/6
 */
public class Main15 {


    /**
     * Definition for a binary tree node.
     * /
     */
     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if(root==null)
                return true;
            if(root.left.val==root.right.val)
            {
                return (isSymmetric(root.left) && isSymmetric(root.right));
            }
            else
            {
                return false;
            }
        }
    }
}

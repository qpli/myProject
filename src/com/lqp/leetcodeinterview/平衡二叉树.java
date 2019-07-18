package com.lqp.leetcodeinterview;

/**
 * Created by lqp
 * Date: 2019/7/3
 */
public class Æ½ºâ¶þ²æÊ÷ {

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public boolean isBalanced(TreeNode root) {
            if(root == null) {
                return true;
            }
            return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }

        private int depth(TreeNode root) {
            if(root == null) {
                return 0;
            }
            int leftDepth = depth(root.left);
            int rightDepth = depth(root.right);
            return (leftDepth > rightDepth ? leftDepth : rightDepth) + 1;
        }
    }




}

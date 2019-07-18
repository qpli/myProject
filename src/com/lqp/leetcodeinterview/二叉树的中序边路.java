package com.lqp.leetcodeinterview;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lqp
 * Date: 2019/7/14
 */
public class 二叉树的中序边路 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();


    }

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public List < Integer > inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(TreeNode root, List < Integer > res) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                helper(root.right, res);
            }
        }
    }


}

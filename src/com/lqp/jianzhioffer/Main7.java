package com.lqp.jianzhioffer;



import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lqp
 * Date: 2019/5/13
 * 根据二叉树的前序遍历和中序遍历的结果，
 * 重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */
public class Main7 {


    public static void main(String[] args) {

    }

//    public TreeNode preInToTree(int[] pre,int[] in)
//    {
//        if(pre==null||in==null)
//            return null;
//        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for(int i=0;i<in.length;i++)
//        {
//            map.put(in[i],i);
//        }
//        return preIn(pre,0,pre.length-1,in,0,in.length-1,map);
//    }
//
//    public TreeNode preIn(int[] p,int pstart,int pend,int[] n,int nstart,int nend,HashMap<Integer,Integer> map)
//    {
//        if(pstart>pend)
//            return null;
//        TreeNode head = new TreeNode(p[pstart]);
//        int index = map.get(p[pstart]);
//        head.left = preIn(p,pstart+1,pstart+index-nstart,n,nstart,index-1,map);
//        head.left = preIn(p,pstart+index-nend+1,pend,n,index+1,nend,map);
//        return head;
//    }


    /**
     * 327 ms	22572K
     * @param pre
     * @param in
     * @return
     */

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0||in.length==0)
        {

            return null;
        }
        TreeNode node=new TreeNode(pre[0]);
        for(int i = 0; i < in.length; i++)
        {
            if(pre[0] == in[i]){
                node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
                node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1,in.length));
            }
        }
        return node;
    }


    /**
     *运行时间：268ms
     *
     * 占用内存：22408k
     */
//    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
//        if(pre==null||in==null)
//            return null;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<in.length;i++)
//        {
//            map.put(in[i],i);
//        }
////        return preIn(pre,0,pre.length-1,in,0,in.length-1,map);
//    }

    public TreeNode preIn(int[] p,int pstart,int pend,int[] n,int nstart,int nend,HashMap<Integer,Integer> map)
    {
        if(pstart>pend)
            return null;
        TreeNode head = new TreeNode(p[pstart]);
        int index = map.get(p[pstart]);
        head.left = preIn(p,pstart+1,pstart+index-nstart,n,nstart,index-1,map);
        head.right = preIn(p,pstart+index-nstart+1,pend,n,index,pend,map);
        return head;
    }

}

package com.yydcyy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by YYDCYY on 2019-07-28.
 */
public class T297 {
}


 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

 class Codec {
/*
     * time : O(n);
     * space : O(n);

     白班编程,        Queue<TreeNode> queue = new LinkedList<>(); 写成 ArrayList
     queue.offer(), queue.poll();
*/


    public String serialize(TreeNode root) {
        if (root == null) return "";
        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        queue.offer(root);

        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if (cur == null){
                res.append("null ");
                continue;
            }

            res.append(cur.val + " ");
            queue.offer(cur.left);
            queue.offer(cur.right);
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.equals("")) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        String[] datas = data.split("");
        TreeNode root = new TreeNode( Integer.parseInt(datas[0]));
        queue.offer(root);
        for (int i = 1; i < datas.length; i ++){
            TreeNode cur = queue.poll();
            if ( !datas[i].equals("null")){
                //不为空
                cur.left = new TreeNode(Integer.parseInt(datas[i]));
                queue.offer(cur.left);
            }
            i ++;
            if ( !datas[i].equals("null")){
                cur.right = new TreeNode(Integer.parseInt(datas[i]));
                queue.offer(cur.right);
            }
        }
        return root;

    }
}

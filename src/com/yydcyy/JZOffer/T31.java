package com.yydcyy.JZOffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by YYDCYY on 2019-08-17.
 */
public class T31 {
    /**
     * https://www.acwing.com/problem/content/description/41/
     * 用队列喔
     */

     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
     TreeNode(int x) { val = x; }
  }
    public List<Integer> list;
    public List<Integer> printFromTopToBottom(TreeNode root) {
        list = new ArrayList<>();
        if (root == null)
            return list;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.size() != 0) {
            TreeNode temp = queue.poll();
            list.add(temp.val);
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
        return list;
    }
}

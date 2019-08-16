package com.yydcyy.JZOffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by YYDCYY on 2019-08-17.
 */
public class T32 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> printFromTopToBottom(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> queue = new ArrayDeque<>();

        List<Integer> list ;
        queue.add(root);

        while (!queue.isEmpty()){
            list = new ArrayList<>();
            int count = queue.size(); //放在第一次 queue.poll() 后
            while (count -- != 0){
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            }

            // if (list != null)
            if (list.size() != 0)
                res.add(list);
        }
        return res;
    }
}

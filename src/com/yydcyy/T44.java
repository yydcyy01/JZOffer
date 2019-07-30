package com.yydcyy;

import org.junit.Test;

import java.util.*;

/**
 * Created by Administrator on 2019-04-03.
 */
public class T44 {
     public class TreeNode {
   int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public List<List<Integer>> printFromTopToBottom(TreeNode root) {

        if (root == null) return new ArrayList<>();


        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        List<List<Integer>> level = new LinkedList<>();


        queue.add(root);
        List<Integer> list = new ArrayList<>();


        int nextLevel = 0;
        int curLevel = 1;


        while(queue.size() != 0){
            TreeNode temp = queue.poll();

            list.add(temp.val);
            curLevel --;

            if (curLevel <= 0){
                level.add(list);
                list = new LinkedList<>();
                curLevel = nextLevel;
                nextLevel = 0;
            }

            if (temp.left != null) {queue.add(temp.left);nextLevel++;}
            if (temp.right != null) {queue.add(temp.right);nextLevel++;}
        }
        return level;
    }

    @Test
    public void run1(){
         //[8, 12, 2, null, null, 6, null, 4, null, null, null]
         TreeNode root = new TreeNode(8);
         TreeNode t1 = new TreeNode(12);
         TreeNode t2 = new TreeNode(2);
         TreeNode t3 = new TreeNode(6);
         TreeNode t4 = new TreeNode(4);

         root.left = t1;
         root.right = t2;
         t2.left = t3;
         t3.left = t4;
        List<List<Integer>> level =printFromTopToBottom(root);
        Iterator it = level.iterator();
        while (it.hasNext()){
            List<Integer> list = (List<Integer>) it.next();
            while (list != null) {
                System.out.print(" ," + list.remove(0));
            }
            System.out.println();
        }

    }
}

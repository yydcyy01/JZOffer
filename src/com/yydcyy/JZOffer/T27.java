package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 * https://www.acwing.com/problem/content/description/37/
 */
public class T27 {
        public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        //相等
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right){
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        //都不为空, 比较值
        if (left.val != right.val) return false;
        //值同, 继续比较
        return isSymmetric(left.right, right.left) && isSymmetric(left.left, right.right);
    }

}

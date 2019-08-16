package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 */
public class T26 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
        public boolean hasSubtree(TreeNode pRoot1, TreeNode pRoot2) {
            if (pRoot1 == null || pRoot2 == null) return false;

            if (isSame(pRoot1, pRoot2)) return true;

            return hasSubtree(pRoot1.left, pRoot2) ||  hasSubtree(pRoot1.right, pRoot2); //这个是 或, 左右一边满足即可
        }

        private boolean isSame(TreeNode pRoot1, TreeNode pRoot2){
            if (pRoot2 == null) return true;
            if (pRoot1 == null || pRoot1.val != pRoot2.val) return false;

            //相等, 且不为空
            return isSame(pRoot1.left, pRoot2.left) && isSame(pRoot1.right, pRoot2.right);
        }

}

package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 https://www.acwing.com/problem/content/description/31/

 给定一棵二叉树的其中一个节点，请找出中序遍历序列的下一个节点。

 注意：

 如果给定的节点是中序遍历序列的最后一个，则返回空节点;
 二叉树一定不为空，且给定的节点一定不是空节点；
 假定二叉树是：[2, 1, 3, null, null, null, null]， 给出的是值等于2的节点。

 则应返回值等于3的节点。

 解释：该二叉树的结构如下，2的后继节点是3。
    2
 / \
 1   3
 */
public class T9 {
    /*
		后继规律
		1) 若当前节点有右节点, 则返回 右孩子最左边的节点
		2) 若无右节点
		  2.1) 若前节点无父节点, 返回null

		  2.2) 若当前节点为父节点左孩子, 则父节点为当前节点后继
		  2.3) 若当前节点为父节点右孩子, 则查找将父节点设为当前节点, 循环步骤(2)查找后继, 返回结果.
	*/
    public TreeNode inorderSuccessor(TreeNode p) {
        if (p == null ) return null;

        if (p.right != null){
            p = p.right;
            while (p.left != null){
                p = p.left;
            }
            return p;
        }

        while (p.father != null){
            if (p == p.father.left)
                return p.father;
            else
                p = p.father;
        }
        return null;
    }
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode father;
          TreeNode(int x) { val = x; }
      }

}

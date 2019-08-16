package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 * https://www.acwing.com/problem/content/description/23/
 *
             * 输入一棵二叉树前序遍历和中序遍历的结果，请重建该二叉树。

             注意:

             二叉树中每个节点的值都互不相同；
             输入的前序遍历和中序遍历一定合法；
 */
public class T7 {
        /**
         *有前序遍历 / 中序遍历求构造树
         * 默认信息 : 前序遍历 : root + 左子树 + 右子树     左子树=root + 左1 + 右1 ....
         * 中序遍历 : ① 有序  ② 左子树 + root + 右子树
         *
         *若输出后序遍历  => 其实可以构造树后,
         */
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            if (preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0)
                return null;

            TreeNode root = Construct(preorder, 0, inorder, 0, inorder.length);
            return root;
        }

        private TreeNode Construct(int[] preorder, int preorder_start, int[] inorder, int inorder_start, int length){
            if (length == 0)
                return null;

            int inorder_index = -1;//记录root角标
            for (int i = inorder_start; i <= inorder_start + length; i ++){
                //
                if (inorder[i] == preorder[preorder_start]){
                    inorder_index = i;
                    break;
                }
            }

            int left_length = inorder_index - inorder_start;

            //构建树
            TreeNode node = new TreeNode(preorder[preorder_start]);//当前根节点
            node.left = Construct(preorder, preorder_start + 1, inorder, inorder_start, left_length); //构造左子树
            node.right = Construct(preorder, preorder_start + left_length + 1,inorder, inorder_index + 1, length - left_length - 1); //构造右子树

            return node;
        }
     class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
}

package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 * https://www.acwing.com/problem/content/description/21/
 */
public class T12 {
        private final static int[][] next = {{0,-1},{0,1}, {-1,0}, {1,0}};
        public boolean hasPath(char[][] matrix, String str) {
            if (str.length() == 0) return true;
            if (matrix == null || matrix.length == 0) return false;

            boolean[][] marked = new boolean[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i ++){
                for (int j = 0; j < matrix[0].length; j ++){
                    if (backtracking(matrix, str, marked, 0, i,j))
                        return true;
                }
            }
            return false;
        }

        //r :行   c : 列
        private boolean backtracking(char[][] matrix, String str, boolean[][] marked, int pathLen, int r, int c){
            if (pathLen == str.length())
                return true;

            //检查出错情况 : 1 角标越界 ( 合理取值范围 [0,matrix[0].length) 故取等) 2 不匹配 3 被利用/遍历过
            if (r < 0 || r >= matrix.length || c < 0 || c >= matrix[0].length || matrix[r][c] != str.charAt(pathLen) || marked[r][c] )
                return false;

            marked[r][c] = true;
            for (int[] n : next){ // next[0], int[] n = next[0];  n[0] n[1] 存储角标  +1 / -1
                if (backtracking(matrix, str, marked, pathLen + 1, r + n[0], c + n[1]))
                    return true;
            }
            marked[r][c] = false; //用完释放
            return false;
        }

}

package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 * https://www.acwing.com/problem/content/description/39/
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 */
public class T28     {
    public int[] printMatrix(int[][] matrix) {

        int[] res;
        int sum = 0;
        if (matrix == null || matrix.length == 0)
            return new int[0]; // 这个不能返回 null, 返回 matrix[0]其实也是返回 null . 非要new  int[0]

        res = new int[matrix.length * matrix[0].length];
        int r1 = 0; //左边界
        int r2 = matrix.length - 1; //右边界
        int c1 = 0; //上边界
        int c2 = matrix[0].length - 1; // 下边界
        // 关于取等问题 : c , r 均已处理过, 为有效值 / 范围, 所以全取等
        while (r1 <= r2 && c1 <= c2){
            for (int i = c1; i <= c2; i ++)
                res[sum ++] = matrix[r1][i]; //列 ++
            for (int i = r1 + 1; i <= r2; i ++)
                res[sum ++] = matrix[i][c2];
            if (r1 != r2){
                for (int i = c2 - 1; i >= c1; i --)
                    res[sum ++] = matrix[r2][i];
            }
            if (c1 != c2){
                for (int i = r2 - 1; i > r1; i --)
                    res[sum ++] = matrix[i][c1];
            }

            r1 ++; r2 --; c1 ++; c2 --;
        }
        return res;
    }
}

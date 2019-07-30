package com.yydcyy;

/**
 * Created by Administrator on 2019-04-02.
 */
public class T40 {
    public int[] printMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] res = new int[n*m];
        if (matrix.length == 0) return null;


        boolean[][] st = new boolean[n][m];
        for (int i = 0; i < n; i ++)
            for (int j = 0; j < m; j ++){
                st[i][j] = false;
                res[i*j] = Integer.MAX_VALUE;
            }


        int[] dx = {-1, 0, 1, 0};
        int[] dy={0, 1, 0, -1};
        int x = 0, y = 0, d = 1; //d=1 从右开始

        for (int k = 0; k < n*m; k ++){ // 循环 n*m次
            res[k] = matrix[x][y];
            st[x][y] = true;

            int a = x + dx[d], b = y + dy[d];
            if (a < 0 || a >= n || b < 0 || b >= m || st[a][b]){
                d = (d + 1) % 4;
                a = x + dx[d];
                b = y + dy[d];
            }
            x = a;
            y = b;
        }
        return res;
    }
}

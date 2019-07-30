package com.yydcyy;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

/**
 * Created by Administrator on 2019-04-01.
 */
public class T23 {

    /*
        第一次用回溯做, 学习思路.
        模仿c++做成java
        1) dfs中, boolean[][] 数组被优化去除了. 有意思.
        2) 字符串变量u 要放在比值前,否则数组越界
        3) char == 比较, 可以用toUpperCase() / toLowerCase() 不区分大小写

        java 中 String.length();   int[] arr是 arr.length;  别混了
    */
    public boolean hasPath(char[][] matrix, String str) {
        for (int i = 0; i< matrix.length; i ++){
            for (int j = 0; j<matrix[i].length; j ++){
                if (dfs(matrix, str, 0, i, j)) return true;
            }
        }
        return false;
    }

    boolean dfs(char[][] matrix, String str, int u, int x, int y){
        if (u == str.length()) return true; // 这两句不可换,否则数组索引异常
        //System.out.println("matrix[x][y]="+matrix[x][y] +"  str.charAt(u) = "+str.charAt(u));
        //System.out.println("matrix[x][y] != str.charAt(u): yes !" +matrix[x][y] != str.charAt(u)? true:false );

        //if (matrix[x][y] != str.charAt(u)) {
        if (matrix[x][y] != str.charAt(u)) {
            System.out.println("matrix[x][y] != str.charAt(u): yes !"  );
            return false;
        }
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        //dx 上右下左  i的变化 dy 上右下左 j的变化
        char t = matrix[x][y];
        matrix[x][y] = '*';
        // 正常是建立个boolean[][]矩阵,存当前遍历位置,不允许再重复 ; 这货直接把值替换了,肯定不会重复."能省一点是一点"

        for (int i = 0; i< 4; i ++){  // 递归实现上下左右遍历
            int a = x + dx[i], b = y + dy[i];
            if (a >= 0 && a < matrix.length && b >= 0 && b < matrix[a].length){
                if (dfs(matrix, str, u+1, a, b)) return true;
            }
        }
        matrix[x][y] = t;
        return false;
    }


    @Test
    public void run1(){
        /*char[][]matrix= {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };*/
        char[][]matrix= {{'a'} };

       String str="a" ; //return "true"
        System.out.println("return : " +hasPath(matrix,str));
    }

}

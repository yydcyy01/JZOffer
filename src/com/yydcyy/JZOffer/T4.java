package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 * https://www.acwing.com/problem/content/description/16/
 */
public class T4 {
    /**
     * Time O(m + n)
     * Space O(1)

     */
        public boolean searchArray(int[][] array, int target) {
            if (array == null || array.length ==0 || array[0].length == 0)
                return false;

            int i = 0, j = array[0].length - 1; //将用下标,故 -1; 从右上角开始
            while (i < array.length && j >= 0){
                if (array[i][j] == target ) return true;
                if (array[i][j] > target)
                    j--; //列向左移动
                else
                    i++;
            }
            return false;
        }

}

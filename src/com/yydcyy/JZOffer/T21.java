package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 */
public class T21 {
        public void reOrderArray(int [] array) {
            if (array.length == 0 || array == null) return;

            int i = 0;
            int j = array.length - 1;

            while (i <= j) {
                while (array[i] % 2 == 1) i ++; // 找偶数
                while (array[j] % 2 == 0) j --; // 找奇数

                if(i < j)
                    swap(array, i ,j);
            }
        }

        private void swap(int [] array, int i, int j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
}

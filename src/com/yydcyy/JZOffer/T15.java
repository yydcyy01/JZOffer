package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 */
public class T15 {

    public static void main(String[] args) {
        /**
         * public static int bitCount(int i) {
             // HD, Figure 5-2
             i = i - ((i >>> 1) & 0x55555555);
             i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
             i = (i + (i >>> 4)) & 0x0f0f0f0f;
             i = i + (i >>> 8);
             i = i + (i >>> 16);
             return i & 0x3f;
             有点酷
         }
         */
    }
    public int NumberOf1(int n){
        //方法1 ,吊炸天
        // return Integer.bitCount(n);

        int count = 0;
        while (n != 0){
            count ++;
            n =n &  (n - 1);
        }
        return count;
    }
}

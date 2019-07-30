package com.yydcyy;

import org.junit.Test;

/**
 * Created by Administrator on 2019-04-06.
 */
public class T62 {
    public int getUglyNumber(int n) {
        if (n == 0) return 0;

        int[] uglyNum = new int[n + 5];
        uglyNum[0] = 1;
        int  nextUglyNum = 1;

        int mul2 = 0;
        int mul3 = 0;
        int mul5 = 0;

        while (nextUglyNum < n) {
            int min = Min (uglyNum[mul2] * 2, uglyNum[mul3] * 3, uglyNum[mul5] * 5);
            uglyNum[nextUglyNum] = min;
            while (uglyNum[mul2] * 2 <= uglyNum[nextUglyNum] )
                mul2 ++ ;

            while (uglyNum[mul3] * 3 <= uglyNum[nextUglyNum] )
                mul3 ++;

            while (uglyNum[mul5] * 5 <= uglyNum[nextUglyNum] )
                mul5 ++;

            nextUglyNum ++;
        }

        int ugly = uglyNum[nextUglyNum - 1];
        return ugly;
    }

    int Min(int mul2, int mul3, int mul5){
        int min = mul2 < mul3 ? mul2 : mul3;
        min = min < mul5 ? min : mul5;
        return min;
    }

    @Test
    public void run1(){
        System.out.println(getUglyNumber(5));
    }
}

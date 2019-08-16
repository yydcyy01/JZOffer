package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 * https://www.acwing.com/problem/content/description/19/
 */
public class T10 {

        //递归求
   /* public int Fibonacci(int n) {
         if (n <= 1) return n;

         int [] fib = new int[n + 1];
         fib[1] = 1;
         for (int i = 2; i <= n; i ++){
             fib[i] = fib[i - 1] + fib[i - 2];
         }

         return fib[n];
    }*/

        //动态规划,  Space O(1)
        public int Fibonacci(int n) {
            if (n <= 1) return n;

            int pre1 = 0;
            int pre2 = 1;
            int fib = 0;
            for (int i = 2; i <= n; i ++){
                fib = pre1 + pre2;
                pre1 = pre2;
                pre2 = fib;
            }

            return fib;
        }

}

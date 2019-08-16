package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 * https://www.acwing.com/problem/content/description/24/
 */
public class T14 {
    /*
       结论 :剪成 2 / 3 ,所得乘积最大
   */
    public int maxProductAfterCutting(int length){
        if (length <=3) return length - 1; //2 3都是切成两段

        if (length % 3 == 0){ //3倍数
            return mul(length);
        }
        //length > 4处理
        if (length % 3 == 1){ //3n+1
            if (length == 4) return 2 * 2;
            else return 2 * 2 * (mul(length - 4));
        }

        //length %3 == 2 且 length >= 5情形
        return 2 * mul(length - 2);
    }

    public int mul(int length){
        //自己实现 Math.pow(3, length)
        int res = 1;
        int n = length /3;
        while (n-- != 0){
            res *= 3;
        }
        return res;
    }
}

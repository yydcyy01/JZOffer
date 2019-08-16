package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 * https://www.acwing.com/problem/content/description/26/
 */
public class T16 {
    public double Power(double base, int exponent) {
        if (base == 0) return 0;
        if (exponent == 0)
            return 1.0;

        if (exponent >0)
            return helper(base,exponent);
        else
            return 1.0 / helper(base, Math.abs(exponent));
    }
    private double helper(double base, int exponent){
        double res = 1.0;
        while (exponent != 0){
            res *=base;
            exponent --;
        }
        return res;
    }
}

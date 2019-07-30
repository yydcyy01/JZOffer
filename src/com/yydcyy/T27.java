package com.yydcyy;

import org.junit.Test;

/**
 * Created by Administrator on 2019-04-02.
 */
public class T27 {
    public double Power(double base, int exponent) {
        //边界情况
        if (base == 0) return 0;
        double res =1.0;
        if (exponent == 0) return res;

        res = 1;
        if (exponent > 0){
            while (exponent-- != 0){
                res *= base;
            }
            return res;
        }
        else{ //exponent < 0
            exponent = Math.abs(exponent);
            while (exponent-- != 0)
                res *=  base;
            return 1/res;
        }
    }

    @Test
    public void run1(){
        System.out.println(Power(5,3));
    }
}

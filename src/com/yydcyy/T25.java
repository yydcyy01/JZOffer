package com.yydcyy;

/**
 * Created by Administrator on 2019-04-02.
 */
public class T25 {
    public int maxProductAfterCutting(int length){
        if (length <=3) return 1*(length-1); //2 3都是切成两段
        if (length % 3 == 0){ //3倍数
            return mul(length);
        }
        if (length % 3 == 1){ //3n+1
            if (length == 4) return 2*2;
            else return 2*2*(mul(length - 4));
        }
        if (length % 3 == 2){
            return 2*mul(length-2);
        }
        return -1;
    }

    public int mul(int length){
        int res = 1;
        int n = length /3;
        while (n-- != 0){
            res *= n;
        }
        return res;
    }
}

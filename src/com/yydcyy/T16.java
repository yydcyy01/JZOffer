package com.yydcyy;

import org.junit.Test;

import java.beans.Transient;
import java.util.Stack;

/**
 * Created by Administrator on 2019-03-31.
 */
public class T16 {

        //学习二分 mid分给右边用例  另一题是275
        public int mySqrt1(int x) {
            /* int l = 0, r = x;
            while (l < r){
                int mid = (l + r +1) / 2;   // + 1 ; mid分给右边
                //这里 用 l + (r-l+1) / 2 会超时
                if (mid  <= x / mid) l = mid;   //这里 不取等是错的
                else r = mid - 1;
            }
            return l;   //本题, l直接是结果,不需要处理
        }*/
            int l = 0, r = x;
            while (l < r){
                int mid = (l + r ) / 2;   //没+1 ; mid 分给左边
                if (mid  <= x / mid) l = mid + 1;
                else r = mid;
            }
            return l;
        }
    public int mySqrt2(int x) {
             int l = 0, r = x;
            while (l < r){
                int mid = (l + r +1) / 2;   // + 1 ; mid分给右边
                //这里 用 l + (r-l+1) / 2 会超时
                if (mid  <= x / mid) l = mid;   //这里 不取等是错的
                else r = mid - 1;
            }
            return l;   //本题, l直接是结果,不需要处理
        }
        /*int l = 0, r = x;
        while (l < r){
            int mid = (l + r ) / 2;   //没+1 ; mid 分给左边
            if (mid  <= x / mid) l = mid + 1;
            else r = mid;
        }
        return l;*/


    @Test
    public void run1(){
       // int[] nums = {0,1,3,5,6};
       // int[] nums = {0,0,0,0,0,1};
        int  x =2147395599;
        System.out.println("mySqrt1 = "+ mySqrt1(x));
        System.out.println("mySqrt2 = "+ mySqrt2(x));

    }
}

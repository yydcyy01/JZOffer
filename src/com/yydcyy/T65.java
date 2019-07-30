package com.yydcyy;


import org.junit.Test;

/**
 * Created by Administrator on 2019-04-16.
 */
public class T65 {
    @Test
    public int add(int num1, int num2) {
        return num2 == 0 ? num1 : add(num1 ^ num2, (num1 & num2) << 1);
    }

    @Test
    public void run2(){ 
        System.out.println(add(55, 66));
        String s1;
    //    s1 = s1.trim()
    }
}

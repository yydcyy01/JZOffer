package com.yydcyy;

/**
 * Created by YYDCYY on 2019-08-04.
 */
public class T151 {
    public static void main(String[] args) {
        int i = 5;
        int j = 10;
        System.out.println(~j);
        System.out.println(i+ ~j);


        int i1=0;
        int  j1=i1++;
        if ((++i1) > ++j1 && i1++ == j1) {
            i1 += j1;
        }
        System.out.println("i1:" + i + "..." + j1);

        int a = 0;
        a+=++a;
        System.out.println("a = " + a);
        a = 0;
        a+=a++;
        System.out.println("a =" + a);

    }
}

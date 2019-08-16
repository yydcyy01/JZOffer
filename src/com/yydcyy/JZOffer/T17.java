package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 * 打印从 1 ~ 最大的n位数
 *
 * 不可以int , long 存,  可能会溢出, 应该用String存
 */
public class T17 {
    public static void main(String[] args) {
        new T17().print1ToMaxofNDigits(3);
    }

    public void print1ToMaxofNDigits(int n){
        if (n <= 0)
            return ;
        char[] number = new char[n];
        print1ToMaxofNDigits(number, 0);
    }

    private void print1ToMaxofNDigits(char[] number, int digit) {
        if (digit == number.length) {
            printNumber(number);
            return;
        }

        for (int i = 0; i < 10; i ++){
            number[digit] = (char)(i+'0');
            print1ToMaxofNDigits(number, digit + 1);
        }
    }

    private void printNumber(char[] number) {
        int index = 0;
        while (index < number.length && number[index] == '0'){
            index ++;
        }

        while (index < number.length){
            System.out.print(number[index ++]);
        }
        System.out.println();
    }
}

package com.yydcyy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by Administrator on 2019-04-14.
 */
public class T59 {
    public int[] maxInWindows(int[] nums, int k) {
        ArrayList ret = new ArrayList<>();
        if (k < 1 || k > nums.length)
            return new int[] {};
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 - o1);  /* 大顶堆*/
        for (int i = 0; i < k; i ++)
            heap.add(nums[i]);

        ret.add(heap.peek()); //添加结果
        for (int i = 0, j = i + k; j < nums.length; i ++, j ++){
            heap.remove(nums[i]);
            heap.add(nums[j]);
            ret.add(heap.peek());
        }
        Integer[] retInteger = (Integer[])ret.toArray(new Integer[ret.size()]);
        int[] retInt = new int[ret.size()];
       for (int i = 0; i < ret.size(); i ++){
           retInt[i] = retInteger[i];
       }
        return retInt;
    }
    @Test
    public void run1(){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int [] arr2 = maxInWindows(arr, 3);
        for (int i = 0; i < arr2.length; i ++){
            System.out.print(arr2[i] + "  ");
        }
    }




}

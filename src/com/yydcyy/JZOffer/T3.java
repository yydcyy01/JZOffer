package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-15.
 * https://www.acwing.com/problem/content/14/
 * 数组 P39
 */
public class T3 {
        /**
         *Time   O(n)
         * Space O(1)
         * 固不可排序, 也不可使用额外标记数组
         *
         * 题目有的版本(在线编译器) 要求返回 boolean, 有的是返回 值/-1;  看清楚
         */
        public static int duplicateInArray(int[] nums) {
            if( nums == null || nums.length <= 0)
                return -1;

            for( int i : nums) {
                if (i < 0 || i >= nums.length) return -1; // 题目要求, 先判断, 后续好处理
            }

            for( int i = 0 ; i < nums.length ; i++){
                while( nums[i] != i){
                    if(nums[i] == nums[nums[i]])
                        return nums[i]; //不能return i; i可能一直都是0(换过来的数

                    swap(nums, i,nums[i]);
                }
            }
            //没找到
            return -1;
        }

        private static void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}

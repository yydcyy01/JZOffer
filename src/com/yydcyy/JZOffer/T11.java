package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 * https://www.acwing.com/problem/content/description/20/
 * 旋转数组
 */
public class T11 {
        /**
         * 典型 java版 二分查找, 但是需要定义minNumber() 方法 处理 一种特殊情况 : [1,1,1,0,1]
         */
        public int findMin(int[] nums) {
            if (nums.length == 0) return -1;

            int L = 0, H = nums.length - 1;
            while (L < H){
                int m = L + (H - L) / 2;
                if ((nums[L] == nums[m]) && (nums[m] == nums[H]))
                    return minNumber(nums, L, H);
                else if (nums[m] <= nums[H]){
                    H = m;
                }
                else
                    L = m + 1;
            }
            return nums[L];
        }

        private int minNumber(int[] nums, int L, int H){
            for (int i = L; i < H; i++){
                if (nums[i] > nums[i + 1])
                    return  nums[i + 1];
            }

            return nums[L];

        }

}

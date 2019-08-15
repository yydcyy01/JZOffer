package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 * https://www.acwing.com/problem/content/15/
 */
public class T3_1 {
    /*
    同T3, 只是规定不可以移动数据
	1. Time  O(nlogn)   每次会将区间长度缩小一半，一共会缩小 O(logn) 次。每次统计两个子区间中的数时需要遍历整个数组，时间复杂度是O(n)以总时间复杂度是O(nlogn)。
	2.Space  O(1)       代码中没有用到额外的数组，所以额外的空间复杂度是
    */

        public static int duplicateInArray(int[] nums) {
            //鲁棒性检查
            if (nums == null || nums.length == 0)
                return -1;

            for (int i : nums) {
                if (i < 0 || i >= nums.length) return -1;
            }


            int L = 1,R = nums.length - 1;
            while (L < R){
                int mid = (L + R) / 2;
                int s = 0;
                for (int x : nums){
                    int t = (x >= L && x <=mid)? 1 : 0;
                    s += t;
                }

                if (s > mid - L + 1)
                    R = mid;
                else
                    L = mid + 1;
            }
            return R;
        }

}

package com.yydcyy;

/**
 * Created by Administrator on 2019-03-31.
 *
 */
public class T14 {
    public static void main(String[] args){
        int [] nums ={ 1, 7, 5, 9, 7, 9, 5, 1, 5, 6, 7};
        int res = Solution.duplicateInArray(nums);
        System.out.println("res : " + res);
    }


}

class Solution {
    /*

	1. Time  O(nlogn)   每次会将区间长度缩小一半，一共会缩小O(logn)O(logn)次。每次统计两个子区间中的数时需要遍历整个数组，时间复杂度是O(n)以总时间复杂度是O(nlogn)。
	2.Space  O(1)       代码中没有用到额外的数组，所以额外的空间复杂度是



    */
    public static int duplicateInArray(int[] nums) {
        //鲁棒性检查
        if (nums == null || nums.length == 0) return -1;
        for (int i : nums) {
            if (i < 0 || i >= nums.length) return -1;
        }


        int l = 1,r = nums.length - 1;
        while (l < r){
            int mid = (l + r) / 2;
            int s = 0;
            for (int x : nums){
                int t = (x >= l && x <=mid)? 1 : 0;  //x >= l;  这是L, 不是数字
                s += t;
            }

            if (s > mid - l + 1) r = mid;
            else l = mid + 1;
        }
        return r;
    }
}
package com.yydcyy;

/**
 * Created by Administrator on 2019-03-31.
 */
public class T13{
    public static void main(String[] args){
    int [] nums ={2, 3, 5, 4, 3, 2, 6, 7};
    int res = Solution.duplicateInArray(nums);
    System.out.println("res : " + res);
    }
}
/*
class Solution {
    public static int duplicateInArray(int[] nums) {
        int length = nums.length;
        if( nums == null || length == 0) return -1;
        for( int i : nums) {
            if (i < 0 || i >= nums.length) return -1;
        }
        for( int i = 0 ; i < length ; i++){
           // System.out.println("i : " + i);
            while( nums[i] != i){
                if(nums[i] == nums[nums[i]]) return nums[i]; //不能return i; i可能一直都是0(换过来的数
                //nums[i]所在位置不对,nums[nums[i]] 位置也不对
                //换回来,继续当前的nums[i] while找结果/换
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;

                *//*int temp = nums[i];
                nums[i] = nums[nums[i]];
                nums[nums[i]] = temp;*//*   //捂脸,这写法是错的, 我dubug发现 但是没看明白为啥
            }
        }
        //每找到
        return -1;
    }
}*/
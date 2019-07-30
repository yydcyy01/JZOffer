package com.yydcyy;

import org.junit.Test;

/**
 * Created by Administrator on 2019-04-07.
 */
public class T74 {
    public int findNumberAppearingOnce(int[] nums) {
        int ones = 0, twos = 0;
        for (int x : nums){
            ones = (ones ^ x) & ~twos;
            twos = (twos ^ x) & ~ones;
        }

        return ones;
    }

    @Test
    public void run1(){
        int[] nums = {1,1,1,2,2,2,3,4,4,4};
        //System.out.println(findNumberAppearingOnce(nums));
        System.out.println("Come on!");
    }
}

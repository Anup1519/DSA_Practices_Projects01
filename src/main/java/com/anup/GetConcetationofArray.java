package com.anup;

import java.util.Arrays;

public class GetConcetationofArray {
    public static void main(String[] args) {

        int[] nums = {1,2,1};
//        output = {1,2,1,1,2,1}

        int[] res = getConetation(nums);
        System.out.println(Arrays.toString(res));
    }

    static int[] getConetation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];
        for (int i =0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}

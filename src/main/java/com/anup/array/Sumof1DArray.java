package com.anup.array;

import java.util.Arrays;

public class Sumof1DArray {
    public static void main(String[] args) {
         int[] nums = {1,2,3,4};
         int[] ans = runningBuild1(nums);
        System.out.println(Arrays.toString(ans));
    }

    //running time 1ms this is not good
    static int[] runningBuild(int[] nums){
        int[] ans = new int[nums.length];
        for(int i = 0 ;i<nums.length;i++){
            int sum =0;
            for (int j = 0 ; j<=i;j++){
                sum += nums[j];
            }
            ans[i] = sum;
        }
        return ans;
    }

    //running time 0ms   best approach
    static int[] runningBuild1(int[] nums){
        int[] ans = new int[nums.length];
        ans[0]=nums[0];
        for (int i =1; i<nums.length;i++){
            ans[i]=ans[i-1]+nums[i];
        }
        return ans;
    }
}

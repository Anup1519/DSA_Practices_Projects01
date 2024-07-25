package com.anup.array;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPair {
    public static void main(String[] args) {

       /* Given an array of integers nums, return the number of good pairs.
        A pair (i, j) is called good if nums[i] == nums[j] and i < j.
                Example 1:
        Input: nums = [1,2,3,1,1,3]
        Output: 4
        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
                Example 2:
        Input: nums = [1,1,1,1]
        Output: 6
        Explanation: Each pair in the array are good.*/

        int[] nums = {1,2,3,1,1,3};
        int ans = goodPairs1(nums);
        System.out.println(ans);
    }
    static int goodPairs(int[] nums){
        int count =0;
        for (int i=0;i<nums.length;i++){
            for (int j = 0; j<i;j++){
                if(nums[i]==nums[j]){
                    count +=1;
                }
            }
        }
        return count;
    }

    static int goodPairs1(int[] nums){
        Map<Integer, Integer> countMap = new HashMap<>();
        int goodPairs =0;
        for (int i : nums){
            if (countMap.containsKey(i)) {
                goodPairs += countMap.get(i);
                countMap.put(i, countMap.get(i) + 1);
            }else {
                countMap.put(i, 1);
            }
        }
        return goodPairs;
    }

}

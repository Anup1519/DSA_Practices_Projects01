package com.anup;

public class SumTwoNumber {
    public static void main(String[] args) {

        int[] nums = new int[]{2,7,25,30,40};
        //Hints nums[0]+nums[1]= target = 9

        int target = 9;
        int res = 0;
        for (int i = 0; i < nums.length-1; i++){
            for (int j = 0; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    res = nums[i] + nums[j]; // sum of number
                }
            }
        }
        System.out.println("Sum of two number: "+ res);
    }
}

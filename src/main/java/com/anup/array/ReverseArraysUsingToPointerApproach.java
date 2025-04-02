package com.anup.array;

import java.util.Arrays;

public class ReverseArraysUsingToPointerApproach {
    public static void main(String[] args) {
//          Q2. How do you reverse an array in-place?

        int[] arr1 = {30,20,40,38,28,23,43,5};
        // using two pointer approach
        int left =0;
        int right = arr1.length-1;

        while (left<right){
            int temp = arr1[left];
            arr1[left] = arr1[right];
            arr1[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr1));
    }
}

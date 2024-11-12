package com.anup.binarySearch;

public class CeilingBinerySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 12,14,16};
        int target =5;
        int ans = nextGreaterNumber(arr, target);
        System.out.println(ans);
    }
    static int nextGreaterNumber(int[] nums, int target){
        int start = 0;
        int end= nums.length-1;

        // Ceiling means : smallest element greater than or equal to(>=) target
        while (start<=end){
            int mid = start +(end-start)/2;
            if (target > nums[mid]){
                start=mid+1;
            } else if (target<nums[mid]) {
                end = mid-1;
            } else {
                return mid;
            }
        }
        return start;
    }
}

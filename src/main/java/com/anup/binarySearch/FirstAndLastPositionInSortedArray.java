package com.anup.binarySearch;

import java.util.Arrays;

public class FirstAndLastPositionInSortedArray {
    public static void main(String[] args) {

        int[] arr = {4, 7, 7, 7, 7, 8, 8, 10};
        int target = 8;
        int[] firstAndLastPosition = firstAndLastPosition(arr, target);
        System.out.println(Arrays.toString(firstAndLastPosition));

    }

    static int[] firstAndLastPosition(int[] arr, int target) {

        int[] ans = {-1, -1};
        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);
        return ans;
    }

    static int search(int[] arr, int target, boolean checkStart) {

        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (checkStart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

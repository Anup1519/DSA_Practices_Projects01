package com.anup;

public class SearchElement {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9, 11, 14, 16, 20};
        int target = 16;
//        int ans = linearSearch(arr, target);
        int ans = linearSearch1(arr, target);
        boolean ans1 = linearSearch2(arr, target);
        System.out.println(ans);
        System.out.println(ans1);
    }

    // search element of array or find target and return index of array
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) { // in this integer case arr.length is variable
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // not element found return -1
        return -1; // hear -1 is never the index of the array so return -1
    }

    // search the target and return element
    static int linearSearch1(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE; // hear -1 is the element of the array so return Integer.MAX_VALUE
    }

    // search element and return true
    static boolean linearSearch2(int[] arr, int target) {

        if (arr.length == 0) {
            return false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}

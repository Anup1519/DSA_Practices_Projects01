package com.anup.array;

public class SearchInRange {
    public static void main(String[] arrs) {
        int[] arr = {20, 4, 5, 39, 21, 89};
        int target = 21;
        System.out.println(linearSearch(arr, target, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}

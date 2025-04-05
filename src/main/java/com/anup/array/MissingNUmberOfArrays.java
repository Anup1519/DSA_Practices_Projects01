package com.anup.array;

public class MissingNUmberOfArrays {
    public static void main(String[] args) {
//        How do you find the missing number in an array of integers?

        int[] arr = {1, 2, 4, 5, 6}; // Missing number is 3
        int n = 6;

        System.out.println("Missing number: " + findMissingNumber(arr, n));
        System.out.println("Missing number: " + findMissingNumber1(arr, n));
    }

    // 1st approach using sum of all number
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2; // Sum of numbers from 1 to N
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum; // Missing number
    }

    // 2nd approach using XOR
    public static int findMissingNumber1(int[] arr, int n) {
        int xorFull = 0, xorArr = 0;

        // XOR all numbers from 1 to N
        for (int i = 1; i <= n; i++) {
            xorFull ^= i;
        }

        // XOR all elements in the array
        for (int num : arr) {
            xorArr ^= num;
        }

        return xorFull ^ xorArr; // Missing number
    }
}

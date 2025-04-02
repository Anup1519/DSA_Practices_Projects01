package com.anup.array;

public class FindSecondLargestElementOfArrays {
    public static void main(String[] args) {
//        Q3- How do you find the second-largest element in an array?

        int[] arr2 = {30,20,40,38,28,23,43,5};
        // 1st approach
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for (int num : arr2){
            if (num > largest){
                secLargest = largest;
                largest = num;
            } else if (num > secLargest && num < largest) {
                secLargest = num;
            }
        }
        System.out.println((secLargest == Integer.MIN_VALUE) ? -1 : secLargest);

        // 2nd approach to sort array manually using bubble sort ans find second maximum array
        // in bubble sort in ascending order maximum element in last

        bubbleSort(arr2); // Sort the array manually
        int result = findSecondMaximum(arr2);
        System.out.println(result);

    }
    public static int findSecondMaximum(int[] ar){
        int larg = ar[ar.length - 1];

        // Find the second largest distinct element
        for (int i = ar.length - 2; i >= 0; i--) {
            if (ar[i] < larg) {
                return ar[i]; // Second largest found
            }
        }
        return -1;
    }

    // Bubble sort implementation
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) { // Swap if greater
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

package com.anup;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {18,2,28,24},
                {15,46,17,79,43},
                {48,94,63},
                {78,9,65,32,22,111}
        };
        int target = 22;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(maxElement(arr));
    }

    //search Element in 2D array and return index
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col]== target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // find max element in 2D Array
    static int maxElement(int[][] arr){
        int max = Integer.MIN_VALUE;  //Integer class min value is range from -293748.. and compare to arr value
        for (int[] row : arr){
            for (int intCol : row){
                if (intCol > max){
                    max = intCol;
                }
            }
        }
        return max;
    }
}

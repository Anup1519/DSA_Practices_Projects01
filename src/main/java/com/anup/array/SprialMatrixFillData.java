package com.anup.array;

public class SprialMatrixFillData {
    public static void main(String[] args) {

        int n = 4; // Given a positive number
        int[][] ans = spiralOrderData(n);
        for (int[] row : ans) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    static int[][] spiralOrderData(int n) {

        int left = 0, right = n - 1;
        int top = 0, bottom = n - 1;
        int[][] matrix = new int[n][n];
        int count = 1;

        /*1st loop: This will print the elements from left to right.
        2nd loop: This will print the elements from top to bottom.
        3rd loop: This will print the elements from right to left.
        4th loop: This will print the elements from bottom to top.*/

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                matrix[top][i]=count;
                count++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right]= count;
                count++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i]= count;
                    count++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left]= count;
                    count++;
                }
                left++;
            }
        }
        return matrix;
    }
}

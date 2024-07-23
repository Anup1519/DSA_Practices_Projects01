package com.anup.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},                       //In this array first print(output) 1->2->3->6->9->8->7->4->5
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> ans = spiralOrder(matrix);
        System.out.println(ans);

    }

    static List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;
        List<Integer> ans = new ArrayList<>();

        /*1st loop: This will print the elements from left to right.
        2nd loop: This will print the elements from top to bottom.
        3rd loop: This will print the elements from right to left.
        4th loop: This will print the elements from bottom to top.*/

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}

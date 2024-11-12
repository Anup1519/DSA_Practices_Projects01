package com.anup.array;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {

        /*int[][] arr = {
                {18,22,28},
                {15,46,17},
                {48,94,63},
        };
        int[][] ans = transpose(arr);*/
        int[][] arr = {
                {1,2},
                {3,4}
        };
        int r =1;
        int c =4;
        int[][] ans = matrixReshape(arr, r,c);
        for (int row[] : ans){
            for (int res : row){
                System.out.print(res +" ");
            }
            System.out.println();
        }
    }

    private static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans = new int[n][m]; // first print matrix of index[0] row.= data into first column so reverse the length of matrix
        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
         int index = 0;
        for (int[] row : mat) {
            for (int num : row) {
                res[index++] = num;
            }
        }

        int[][] ans = new int[r][c];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                ans[i][j]=res[index++];
            }
        }
        return ans;
    }
}

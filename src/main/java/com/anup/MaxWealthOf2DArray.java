package com.anup;

import java.util.Arrays;

public class MaxWealthOf2DArray {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
//        int[][] accounts = {{1,5},{7,3},{3,5}};
        int ans = maximumWealth(accounts);
        System.out.println(ans);

    }

    static int maximumWealth(int[][] accounts) {
        int ans =0;
        int[] ad = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j=0;j< accounts[i].length;j++){
                sum += accounts[i][j];
            }
            ad[i]=sum;
        }
        ans =ad[0];
        for (int k =1; k< ad.length;k++){
            if (ad[k]>ans){
                ans = ad[k];
            }
        }
        return ans;
    }
}

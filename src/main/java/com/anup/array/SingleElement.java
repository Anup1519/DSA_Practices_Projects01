package com.anup.array;

public class SingleElement {

    public static void main(String[] args) {

        int[] arr = new int[]{2,1,2,1,3};

//        case 1 Time Complexity O(n^2) and Space Complexity O(1)
        for (int i =0; i< arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if (arr[i]==arr[j] && arr[i] != -1 && i != j){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
            if (arr[i]!= -1){
                System.out.println(arr[i]);
            }
        }
//        case 2  Linear TC O(n) SC(1)
        int ans = 0;
        for (int num : arr){
            ans = num^ans;    // using XOR if match then 0 and not match 1
        }
        System.out.println(ans);
    }
}

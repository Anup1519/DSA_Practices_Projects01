package com.anup;

public class ReverseArray {
    public static void main(String[] args) {

         /*List<Integer> array = new ArrayList<>();
        array.add(8);
        array.add(9);
        array.add(11);

        System.out.println(array);*/

        FindMaximumElementToArray array = new FindMaximumElementToArray(5);
        array.insert(18);
        array.insert(9);
        array.insert(11);
        array.insert(22);
        array.insert(2);

        System.out.println(array.max());// Max Element
        System.out.println(array.min()); // Min Element

        //case 1
        int[] arr = new int[]{1,2,3,4,5};
        FindMaximumElementToArray newArr = new FindMaximumElementToArray(arr.length);
        for (int i = arr.length-1; i>=0; i--){
            newArr.insert(arr[i]);
        }
        System.out.println(newArr); // this code reverse array take Space or Time Complexity o(n)
        //because new array create so space is more


        //case 2
        FindMaximumElementToArray ar = new FindMaximumElementToArray(5);
        ar.insert(2);
        ar.insert(3);
        ar.insert(4);
        ar.insert(5);
        ar.insert(6);

        ar.reverseArray(); // call method to reverse array with SC O(1) and TC O(n/2)
        System.out.println(ar);
    }

}

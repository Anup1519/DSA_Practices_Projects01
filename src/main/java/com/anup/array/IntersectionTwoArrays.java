package com.anup.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionTwoArrays {
    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] ac = intersectionArray(nums1, nums2);

        for (int i =0; i< ac.length; i++){
            System.out.println(ac[i]+" "+i);
        }
    }
    static int[] intersectionArray(int[] nums1, int[] nums2){

        // Create a hashmap to store the count of each element in nums1
        HashMap<Integer, Integer> map = new HashMap<>();

        // Fill the map with elements from nums1 and their counts
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // List to store the intersection result
        List<Integer> result = new ArrayList<>();

        // Iterate through nums2 and check if the element is in the map
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);  // Add common element to the result
                map.put(num, map.get(num) - 1);  // Decrease the count of the element
            }
        }

        // Convert the result list to an array
        int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
        }

        return intersection;
    }
}

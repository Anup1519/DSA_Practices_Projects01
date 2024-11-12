package com.anup.binarySearch;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {

        char[] letters = {'x','x','y','y'};
        char target = 'z';
        char c = nextGreatestLetter(letters, target);
        System.out.println(c);

    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end= mid - 1;
            } else {
                start = mid + 1;
            }
        }
//        The modulo operation ensures that we wrap around if 'start' goes beyond the last index
        return letters[start % letters.length];
    }
}

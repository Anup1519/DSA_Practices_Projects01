package com.anup.string;

public class SearchInString {
    public static void main(String[] args) {

        String name = "anup";
        char ch = 'u';
        System.out.println(search(name, ch));
        System.out.println(search1(name, ch));
    }

    static boolean search(String str, char target) {
        if (str.length() == target) { // int this string case str.length() is function/method and internally call variable
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean search1(String str, char target) {
        if (str.length() == target) { // int this string case str.length() is function/method and internally call variable
            return false;
        }
        for( char ch : str.toCharArray()){ // str.toCharArray() is convert string to Array of character like [ a, n, u,p]
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}

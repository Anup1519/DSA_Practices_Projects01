package com.anup.string;

import java.util.HashMap;
import java.util.Map;

public class countLetter {
    public static void main(String[] args) {

        String str = "aabbbcccc";
        countStringLetter(str);
    }

    public static void countStringLetter(String str){

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i< str.length(); i++){
            char value = str.charAt(i);
            if (map.containsKey(value)){
               int count = map.get(value)+1;
               map.put(value, count);
            } else {
                map.put(value, 1);
            }
        }

        for (Map.Entry<Character,Integer> res : map.entrySet()){
            System.out.print(res.getKey()+""+res.getValue());
        }
    }
}

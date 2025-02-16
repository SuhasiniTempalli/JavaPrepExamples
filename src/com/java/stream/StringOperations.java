package com.java.stream;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringOperations {


    public static void main(String args[]){
        StringOperations operations=new StringOperations();
        String input="banana";
        char ch=operations.findNonRepeating(input);
        System.out.println("Non-repeating character----"+ch);
    }

    private char findNonRepeating(String input) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char ch:input.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
       for(Map.Entry<Character,Integer> entry: map.entrySet()){
           if(entry.getValue()==1){
               return entry.getKey();
           }
       }return 0;
    }
}

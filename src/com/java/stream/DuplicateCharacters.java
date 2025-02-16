package com.java.stream;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharacters {

    public static void main(String args[]){
        DuplicateCharacters dp=new DuplicateCharacters();
        String input="Wednesday";
        dp.findDuplicates(input);
    }

    private void findDuplicates(String input) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char ch:input.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()!=1){
                System.out.println("Printing the Duplicates---"+entry.getKey()+"-"+entry.getValue());
            }
        }
    }
}

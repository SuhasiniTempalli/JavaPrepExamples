package com.java.examples;


import java.util.HashMap;

class Solution {

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> magazineCount=new HashMap<>();
        for (char c : magazine.toCharArray()) {
            magazineCount.put(c, magazineCount.getOrDefault(c, 0) + 1);
        }

        // Iterate through each letter in the ransomNote and check if it can be constructed
        for (char c : ransomNote.toCharArray()) {
            // If the character is not found in the magazine or there are not enough occurrences, return false
            if (!magazineCount.containsKey(c) || magazineCount.get(c) == 0) {
                return false;
            }
            // Decrease the count of that character in the magazineCount map
            magazineCount.put(c, magazineCount.get(c) - 1);
        }

        return true;


    }
    public static void main(String args[])
    {
        boolean result=canConstruct("aa","aab");
    }
}

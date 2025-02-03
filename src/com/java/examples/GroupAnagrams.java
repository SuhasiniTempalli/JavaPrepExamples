package com.java.examples;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            // Sort the string and use the sorted string as a key
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            // If the sorted string is not in the map, add it with an empty list
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
                //System.out.println(map);
            }
            //System.out.println(("sorted"+map.get(sortedStr)));
            // Add the original string to the list corresponding to the sorted string
            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }


    public static void main(String args[]) {
        GroupAnagrams group = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = group.groupAnagrams(strs);

        for (List<String> output : result) {
            System.out.println(output);
        }
    }
}

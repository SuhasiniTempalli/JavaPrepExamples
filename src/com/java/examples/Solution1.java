package com.java.examples;

import java.util.HashMap;

public class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement exists in the map, return the pair of indices
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Otherwise, add the current number with its index to the map
            map.put(nums[i], i);
        }

        // Since the problem guarantees one solution, we don't need to return anything here.
        throw new IllegalArgumentException("No solution found");
    }


    public static void main(String args[]) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = twoSum(nums, 9);
        System.out.println(indices);
        System.out.println("Indices: [" + indices[0] + ", " + indices[1] + "]");
    }
}

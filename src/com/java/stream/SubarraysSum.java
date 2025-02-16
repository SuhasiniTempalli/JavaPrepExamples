package com.java.stream;

import java.util.*;


public class SubarraysSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3};  // Example sorted array with possible subarrays summing to 8
        int targetSum = 8;

        // Function call to print all subarrays whose sum is 8
        printSubarraysWithSum(arr, targetSum);
    }

    public static void printSubarraysWithSum(int[] arr, int targetSum) {
        // Traverse through the array
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;

            // Start from each element and add the next elements until sum reaches 8
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];

                // If current sum matches target sum, print the subarray
                if (currentSum == targetSum) {
                    System.out.print("Subarray: ");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }

                // If sum exceeds target, no point in adding more elements in the current subarray
                if (currentSum > targetSum) {
                    break;
                }
            }
        }
    }
}

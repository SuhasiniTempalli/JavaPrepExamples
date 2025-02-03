package com.java.examples;

public class BuyStock {

    public int maxProfit(int[] prices) {
        // Edge case: if there are less than 2 prices, no profit can be made
        if (prices == null || prices.length < 2) {
            return 0;
        }

        // Initialize variables for tracking minimum price and maximum profit
        int minPrice = prices[0];  // Start with the first price as the minimum price
        int maxProfit = 0;         // Initialize max profit to 0

        // Traverse through the prices array
        for (int i = 1; i < prices.length; i++) {
            // If current price is less than minPrice, update minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // Calculate profit if we sell on the current day
                int profit = prices[i] - minPrice;
                // Update maxProfit if the current profit is higher than previous maxProfit
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;  // Return the maximum profit
    }

    public static void main(String[] args) {
        BuyStock sp = new BuyStock();

        // Test case 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit for Test 1: " + sp.maxProfit(prices1)); // Output: 5

        // Test case 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Maximum Profit for Test 2: " + sp.maxProfit(prices2)); // Output: 0
    }
}

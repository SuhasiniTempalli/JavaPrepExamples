package com.java.examples;

class StockProfit {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        int total = 0;
        int minPrice = 0;
        int maxPrice = 0;
        if (prices == null || prices.length < 2) {
            return 0;
        }
        for (int i = 1; i < prices.length; i++) {

            if (prices[i] > prices[i - 1]) {
                minPrice = prices[i - 1];
                maxPrice = prices[i];
                int profit = maxPrice - minPrice;
                totalProfit = totalProfit + profit;
            }

        }
        return totalProfit;
    }

    public static void main(String args[]) {
        StockProfit st = new StockProfit();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int totalProfit = st.maxProfit(prices);
        System.out.println("Total Profit" + totalProfit);
    }
}

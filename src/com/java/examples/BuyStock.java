class BuyStock {
    public int maxProfit(int prices[]) {
        int minPrice=prices[0];
        int maxProfit=0;
        for (int i = 0; i < prices.length; i++) {
            //int minPrice=prices[i];
            // If current price is less than minPrice, update minPrice
            if (prices[i] < minPrice && prices[i]!=0) {
                minPrice = prices[i];
            } else {
                // Calculate profit if we sell on the current day
                int profit = prices[i] - minPrice;
                // Update maxProfit if the current profit is higher than previous maxProfit
                maxProfit = Math.max(maxProfit, profit);
            }

        }

        return maxProfit;
    }

    public static void main(String args[]){
        BuyStock st=new BuyStock();
        int prices[]={3,3,5,0,0,3,1,4};
        int maxProfit=st.maxProfit(prices);
        System.out.println(maxProfit);
    }
}
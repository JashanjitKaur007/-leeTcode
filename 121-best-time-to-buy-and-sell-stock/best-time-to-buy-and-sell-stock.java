class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        // KADANE'S ALGO 

        int profit = 0;
        int buy = prices[0];
        int sell = prices[0];

        for(int i=0; i<n; i++){
            if(prices[i] < buy){
                buy = prices[i];
                sell = 0;
            }
            if(prices[i] > sell){
                if(prices[i] - buy > profit){
                    sell = prices[i];
                    profit = sell - buy;
                }
            }
        }

        return profit;
    }
}
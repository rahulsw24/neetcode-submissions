class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int buyP = prices[0];
        for(int i = 1;i<prices.length;i++){
            int profit = prices[i] - buyP;
            maxP = Math.max(profit,maxP);
            buyP = Math.min(prices[i],buyP);
        }

        return maxP;
        
    }
}

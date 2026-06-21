class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxP = 0;

        for(int i = 0;i<prices.length;i++){
            int currP = prices[i] - mini;
            maxP = Math.max(maxP,currP);
            mini = Math.min(prices[i],mini);
        }
        return maxP;
        
    }
}

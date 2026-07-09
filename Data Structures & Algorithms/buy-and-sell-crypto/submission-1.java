class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i = 0; i < prices.length; i++)
        {
            for(int j = i + 1; j < prices.length; j++)
            {
                int potentialProfit = prices[j] - prices[i];
                if(potentialProfit > profit)
                {
                    profit = prices[j] - prices[i];
                }
            }
        }

        return profit;
    }
}

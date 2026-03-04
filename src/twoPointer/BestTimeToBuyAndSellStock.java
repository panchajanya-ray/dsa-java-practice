// LeetCode Problem: 121. Best Time to Buy and Sell Stock
// Pattern: Sliding Window/ Greedy
// Time Complexity: O(n)
// Space Complexity: O(1)

package twoPointer;

public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<buy) buy=prices[i];
            if((prices[i]-buy)>profit) profit=prices[i]-buy;
        }
        return profit;
    }
}

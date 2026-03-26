// LeetCode 518. Coin Change II
// Pattern: Dynamic Programming
// Time Complexity: O(n * S), S = amount
// Space Complexity: O(S), S = amount

package dp;

public class CoinChangeII {
	public int change(int amount, int[] coins) {
        int dp[] = new int[amount+1];
        dp[0] = 1;
        for(int coin: coins)
        {
            for(int i=coin;i<amount+1;i++)
            {
                dp[i] += dp[i-coin];
            }
        }
        return dp[amount];
    }
}

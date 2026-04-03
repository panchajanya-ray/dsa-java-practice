// LeetCode 279. Perfect Squares
// Pattern: Dynamic Programming
// Time Complexity: O(n * sqrt(n))
// Space Complexity: O(1)

package dp;

import java.util.Arrays;

public class PerfectSquares {
	public int numSquares(int n) {

        int dp[] = new int[n + 1];
        Arrays.fill(dp, n + 1);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j * j <= i; j++) 
            {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        return dp[n];
    }
}

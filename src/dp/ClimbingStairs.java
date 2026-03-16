// LeetCode 70. Climbing Stairs
// Pattern: Dynamic Programming, Fibonacci pattern
// Time Complexity: O(n)
// Space Complexity: O(n)

package dp;

public class ClimbingStairs {
	public int climbStairs(int n) {
        int dp[] = new int[n+1];
        dp[n] = 0;
        dp[n-1] = 1;
        for(int i=n-2;i>=0;i--)
        {
            dp[i] = dp[i+1] + dp[i+2];
        }
        return dp[0]+dp[1];
    }
}

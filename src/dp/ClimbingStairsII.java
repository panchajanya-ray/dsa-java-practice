// LeetCode 3693. Climbing Stairs II
// Pattern: Dynamic Programming
// Time Complexity: O(n)
// Space Complexity: O(n)

package dp;

//import java.util.Arrays

public class ClimbingStairsII {
	public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n + 1];

        if (n >= 1) dp[1] = costs[0] + 1;
        if (n >= 2) dp[2] = costs[1] + Math.min(dp[1] + 1, 4);

        for (int i = 3; i <= n; i++) {
            dp[i] = costs[i-1] + Math.min(
                dp[i - 1] + 1,
                Math.min(
                    dp[i - 2] + 4,
                    dp[i - 3] + 9
                )
            );
        }

        return dp[n];
    }
	
	/*
    public int climbStairs(int n, int[] costs) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(0, n, costs, dp);
    }

    public int solve(int i, int n, int[] costs, int[] dp)
    {
        if(i > n) return Integer.MAX_VALUE;
        if(i == n) return 0;
        if(dp[i] != -1) return dp[i];

        int step1 = (costs[i] + 1) + solve (i+1, n, costs, dp);
        int step2 = (i + 2 <= n) ? (costs[i+1]+4) + solve(i+2, n, costs, dp) : Integer.MAX_VALUE;
        int step3 = (i + 3 <= n) ? (costs[i+2]+9) + solve(i+3, n, costs, dp) : Integer.MAX_VALUE;

        return dp[i] = Math.min(step1, Math.min(step2, step3));
    }
    */
}

// LeetCode 494. Target Sum
// Pattern: Dynamic Programming
// Time Complexity: O(N X S)
// Space Complexity: O(S), S = The target subset sum, (sum = (target + TotSum) / 2).

package dp;

public class TargetSum {
	public int findTargetSumWays(int[] nums, int target) {
	    int TotSum = 0;
	    for (int num : nums) TotSum += num;

	    if (Math.abs(target) > TotSum || (target + TotSum) % 2 != 0) return 0;
	    
	    int sum = (target + TotSum) / 2;
	    int[] dp = new int[sum + 1];
	    dp[0] = 1;

	    for (int num : nums) {
	        for (int j = sum; j >= num; j--) {
	            dp[j] += dp[j - num];
	        }
	    }
	    return dp[sum];
	}
}

// LeetCode 198. House Robber
// Pattern: Dynamic Programming, choose/ skip
// Time Complexity: O(n)
// Space Complexity: O(n)

package dp;

public class HouseRobber {
	public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        dp[0] = 0;
        dp[1]= nums[0];
        for(int i=1;i<nums.length;i++)
        {
            dp[i+1] = Math.max(dp[i], dp[i-1]+ nums[i]);
        }
        return dp[nums.length];
    }
}

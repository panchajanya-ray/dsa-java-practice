// LeetCode 300. Longest Increasing Subsequence
// Pattern: Dynamic Programming
// Time Complexity: O(n^2)
// Space Complexity: O(n)

package dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
	public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        
        Arrays.fill(dp,1);

        int max = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0; j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }
            max = Math.max(max,dp[i]);
        }
        
        return max;
    }
}

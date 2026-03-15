// LeetCode 53. Maximum Subarray
// Pattern: Dynamic Programming, Kadane's Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)

package array;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
        int res = nums[0];
        int maxSum = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            maxSum = Math.max(maxSum+nums[i], nums[i]);

            res = Math.max(maxSum, res);
        }
        return res;
    }
}

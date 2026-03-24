// LeetCode 209. Minimum Size Subarray Sum
// Pattern: Dynamic Sized Sliding Window
// Time Complexity: O(n)
// Space Complexity: O(1)

package slidingWindow;

public class MinimumSizeSubarraySum {
	public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int end = 0; end < nums.length; end++) 
        {
            sum += nums[end];
            while (sum >= target) 
            {
                minLength = Math.min(minLength, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }
    
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}

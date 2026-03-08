// LeetCode 643. Maximum Average Subarray I
// Pattern: Sliding Window
// Time Complexity: O(n)
// Space Complexity: O(1)

package slidingWindow;

public class MaximumAverageSubarrayI {
	public double findMaxAverage(int[] nums, int k) {
        double maxSum;
        double sum = 0.0d;
        for(int i=0;i<k;i++) sum+=nums[i];
        maxSum = sum;
        for(int i=k;i<nums.length;i++)
        {
            sum+= nums[i] - nums[i - k];
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum/k;
    }
}

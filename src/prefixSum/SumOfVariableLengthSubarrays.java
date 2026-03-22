// LeetCode 3427. Sum of Variable Length Subarrays
// Pattern: Prefix Sum
// Time Complexity: O(n)
// Space Complexity: O(1)

package prefixSum;

public class SumOfVariableLengthSubarrays {
	public int subarraySum(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++){
            int j = i - nums[i] - 1;
            nums[i] += nums[i - 1];
            sum += nums[i] - (j < 0 ? 0 : nums[j]);
        }
        return sum;
    }
}

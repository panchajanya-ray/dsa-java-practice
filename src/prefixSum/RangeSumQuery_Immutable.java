// LeetCode 303. Range Sum Query - Immutable
// Pattern: Prefix Sum
// Time Complexity: O(n)
// Space Complexity: O(n)

package prefixSum;

public class RangeSumQuery_Immutable {
	int [] prefix_sum;
    public void NumArray(int[] nums) {
        prefix_sum = new int[nums.length];
        prefix_sum[0] = nums[0];
        int n = nums.length;
        for(int i = 1; i<n; i++) prefix_sum[i] = prefix_sum[i-1] + nums[i];
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) return prefix_sum[right];
        return prefix_sum[right] - prefix_sum[left-1];
    }
}

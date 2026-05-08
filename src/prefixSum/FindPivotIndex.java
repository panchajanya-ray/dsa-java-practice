// LeetCode 724. Find Pivot Index
// Pattern: Prefix Sum
// Time Complexity: O(n)
// Space Complexity: O(1)

package prefixSum;

public class FindPivotIndex {
	public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int num : nums) sum += num;
        
        int prefix = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(prefix == (sum - prefix - nums[i])) return i;
            prefix += nums[i];
        }
        return -1;
    }
}

// LeetCode Problem: 3701. Compute Alternating Sum
// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

package array;

public class ComputeAlternatingSum {
	public int alternatingSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length;i++) sum += (i % 2 == 0) ? nums[i] : -nums[i];
        return sum; 
    }
}

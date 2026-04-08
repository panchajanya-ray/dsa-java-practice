// LeetCode Problem: 1920. Build Array from Permutation
// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(n)

package array;

public class BuildArrayFromPermutation {
	public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];

        for(int i=0;i<nums.length;i++) ans[i] = nums[nums[i]];

        return ans;
    }
}

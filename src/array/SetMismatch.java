// LeetCode Problem: 645. Set Mismatch
// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

package array;

public class SetMismatch {
	public int[] findErrorNums(int[] nums) {
        int ans[] = {-1, -1};
        for(int i = 0; i < nums.length; i++)
        {
            int indx = Math.abs(nums[i]) - 1;
            if(nums[indx] < 0) ans[0] = Math.abs(nums[i]);
            else  nums[indx] *= -1;
        }

        for(int i = 0; i<nums.length; i++) if(nums[i] > 0) ans[1] = i+1;

        return ans;
    }
}

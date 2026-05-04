// LeetCode Problem: 1679. Max Number of K-Sum Pairs
// Pattern: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

package twoPointer;

import java.util.Arrays;

public class MaxNumberOfK_SumPairs {
	public int maxOperations(int[] nums, int k) {
        int ans = 0;
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while(i < j)
        {
            int sum = nums[i] + nums[j];
            if(sum == k)
            {
                ans++;
                i++;
                j--;
            }
            else if(sum > k)
            {
                if(nums[i] > nums[j]) i++;
                else j--;
            }
            else
            {
                if(nums[i] < nums[j]) i++;
                else j--;
            }
        }

        return ans;
    }
}

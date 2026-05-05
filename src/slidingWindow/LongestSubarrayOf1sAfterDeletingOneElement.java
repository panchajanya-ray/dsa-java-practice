// LeetCode 1493. Longest Subarray of 1's After Deleting One Element
// Pattern: Sliding Window
// Time Complexity: O(n)
// Space Complexity: O(1)


package slidingWindow;

public class LongestSubarrayOf1sAfterDeletingOneElement {
	public int longestSubarray(int[] nums) {
        int ans = 0;
        int left = 0;
        int zeroAllowed = 1;
        
        for(int right = 0; right < nums.length; right++)
        {
            if(nums[right] == 0) zeroAllowed--;

            while(zeroAllowed < 0)
            {
                if(nums[left++] == 0) zeroAllowed++;
            }

            ans = Math.max(ans, right - left);
        }
        
        return ans;
    }
}

// LeetCode 2149. Rearrange Array Elements by Sign
// Pattern: Two Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)

package twoPointer;

public class RearrangeArrayElementsBySign {
	public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        if(n==2 && nums[0]>0) return nums;
        int i = 0;
        int j = 1;
        int[] ans = new int[n];
        for(int a = 0;a<n;a++)
        {
            if(nums[a]>0)
            {
                ans[i] = nums[a];
                i+=2;
            }
            else
            {
                ans[j] = nums[a];
                j+=2;
            }
        }
        return ans;
    }
}

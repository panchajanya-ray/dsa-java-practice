// LeetCode 922. Sort Array By Parity II
// Pattern: Two Pointers, alternatively
// Time Complexity: O(n)
// Space Complexity: O(n)

package twoPointer;

public class SortArrayByParityII {
	public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        if(n==2 && nums[0]%2==0) return nums;
        int i = 0;
        int j = 1;
        int[] ans = new int[n];
        for(int a = 0;a<n;a++)
        {
            if(nums[a]%2==0)
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

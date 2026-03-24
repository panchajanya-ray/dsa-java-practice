// LeetCode 905. Sort Array By Parity
// Pattern: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

package twoPointer;

public class SortArrayByParity {
	public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1) return nums;
        int n = nums.length;
        int even=0;
        int odd=n-1;
        while(even<=odd)
        {
            if(nums[even]%2==0) even++;
            else
            {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                odd--;
            }
        }
        return nums;
    }
}

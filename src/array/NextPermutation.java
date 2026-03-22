// LeetCode 31. Next Permutation
// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

package array;

public class NextPermutation {
	public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        if(i<0)
        {
            reverse(nums,0,n-1);
            return;
        }

        int j=n-1;
        while(nums[j]<=nums[i]) j--;

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        reverse(nums,i+1,n-1);
    }

    private void reverse(int[] nums, int left, int right)
    {
        while(left<right)
        {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}

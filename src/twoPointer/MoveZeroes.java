// LeetCode Problem: 283. Move Zeroes
// Pattern: Two Pointers/ Array Manipulations
// Time Complexity: O(n)
// Space Complexity: O(1)

package twoPointer;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
        int i=-1;
        for(int j=0;j<nums.length;j++) if(nums[j]!=0) nums[++i]=nums[j];
        for(int j=i+1;j<nums.length;j++) nums[j]=0;
    }
}

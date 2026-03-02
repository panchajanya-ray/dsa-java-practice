// LeetCode Problem: 26. Remove Duplicates from Sorted Array
// Time Complexity: O(N)
// Space Complexity: O(1)

package arrays;

public class Remove_Duplicates_Sorted_Array {
	public static void main(String[] args) {
	     int result = new Solution5().removeDuplicates(new int[] {-3,-1,0,0,0,3,3});
	     
	     System.out.println("result = "+result);
	 }
}

class Solution5 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
    
        int i = 0;
        for (int j = 1; j < nums.length; j++) 
        {
            if (nums[j] != nums[i]) 
            {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}


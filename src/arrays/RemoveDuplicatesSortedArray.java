// LeetCode Problem: 26. Remove Duplicates from Sorted Array
// Time Complexity: O(N)
// Space Complexity: O(1)

package arrays;

public class RemoveDuplicatesSortedArray {
	public static void main(String[] args) {
	     int result = new RemoveDuplicatesSortedArray().removeDuplicates(new int[] {-3,-1,0,0,0,3,3});
	     
	     System.out.println("result = "+result);
	 }
	
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



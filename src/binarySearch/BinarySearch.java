// LeetCode 704. Binary Search
// Pattern: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

package binarySearch;

public class BinarySearch {
	public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) right=mid-1;
            else left=mid+1;
        }
        return -1;
    }
}

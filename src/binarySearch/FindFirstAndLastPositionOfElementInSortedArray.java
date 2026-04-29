// LeetCode 34. Find First and Last Position of Element in Sorted Array
// Pattern: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

package binarySearch;

public class FindFirstAndLastPositionOfElementInSortedArray {
	public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
    
        ans[0] = findBound(nums, target, true);

        if (ans[0] != -1) ans[1] = findBound(nums, target, false);
    
        return ans;
    }

    public int findBound(int[] nums, int target, boolean isFirst) 
    {
        int left = 0, right = nums.length - 1;
        int bound = -1;

        while (left <= right) 
        {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) 
            {
                bound = mid;
                if (isFirst) right = mid - 1; 
                else left = mid + 1;
            } 
            else if (nums[mid] < target) left = mid + 1; 
            else right = mid - 1;
        }
        return bound;
    }
}

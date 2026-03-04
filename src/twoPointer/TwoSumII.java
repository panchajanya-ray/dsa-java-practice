// LeetCode Problem: 167. Two Sum II - Input Array Is Sorted
// Pattern: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

package twoPointer;

public class TwoSumII {
	public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while(start<end)
        {
            int sum = numbers[start]+numbers[end];
            if(sum==target) return new int[] {start+1,end+1};
            else if(sum>target) end--;
            else start++;
        }
        return new int[] {-1,-1};
    }
}

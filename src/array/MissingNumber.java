// LeetCode 268. Missing Number
// Pattern: Array
// Time Complexity: O(n)
// Space Complexity: O(1)

package array;

public class MissingNumber {
	public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n+1) / 2;
        int sum=0;
        for(int num:nums) sum+=num;
        return expectedSum-sum;
    }
}

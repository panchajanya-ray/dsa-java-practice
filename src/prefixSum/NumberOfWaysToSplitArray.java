// LeetCode 2270. Number of Ways to Split Array
// Pattern: Prefix Sum
// Time Complexity: O(n)
// Space Complexity: O(1)

package prefixSum;

public class NumberOfWaysToSplitArray {
	public int waysToSplitArray(int[] nums) {
        int cnt=0;
        long sum=0;
        long leftSum=0;
        for(int num: nums) sum+=num;
        for(int i=0;i<nums.length-1;i++)
        {
            leftSum += nums[i];
            if(leftSum>=sum-leftSum) cnt++;
        }
        return cnt;
    }
}

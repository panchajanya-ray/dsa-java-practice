// LeetCode Problem: 3512. Minimum Operations to Make Array Sum Divisible by K
// Time Complexity: O(n)
// Space Complexity: O(1)

package array;

class ArraySumDivisibleByK {
    public int minOperations(int[] nums, int k) {
        for(int i = 1;i<nums.length;i++)
        {
            nums[0]+=nums[i];
        }
        return (nums[0]%k);
    }
}
// LeetCode 485. Max Consecutive Ones
// Pattern: Arrays
// Time Complexity: O(N)
// Space Complexity: O(1)

package array;

public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
        int countOnes=0;
        int maxOnes=0;
        for(int num:nums)
        {
            if(num == 0)
            {
                maxOnes = Math.max(maxOnes, countOnes);
                countOnes=0;
            }
            else countOnes++;
        }
        return Math.max(maxOnes, countOnes);
    }
}

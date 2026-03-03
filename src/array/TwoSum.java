// LeetCode Problem: 1. Two Sum
// Time Complexity: O(N)
// Space Complexity: O(N)

package array;

import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> num = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            if(num.containsKey(target-nums[i])) return new int[]{num.get(target-nums[i]), i};
            num.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }

}
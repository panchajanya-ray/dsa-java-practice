// LeetCode 523. Continuous Subarray Sum
// Pattern: Prefix Sum, HashMap, Modulo trick
// Time Complexity: O(n)
// Space Complexity: O(min(n, k))   // worst case O(n)

package prefixSum;

import java.util.HashMap;

public class ContinuousSubarraySum {
	public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length < 2) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int rem = sum%k;
            if(!map.containsKey(rem)) map.put(rem,i);
            else
            {
                if((i - map.get(rem))>1) return true;
            }  
        }
        return false;
    }
}

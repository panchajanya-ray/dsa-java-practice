// LeetCode 560. Subarray Sum Equals K
// Pattern: Hashing
// Time Complexity: O(n)
// Space Complexity: O(n)

package hashing;

import java.util.HashMap;

public class SubarraySumEqualsK {
	public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum=0;
        int count=0;
        mp.put(0,1);
        for(int num: nums)
        {
            sum+=num;
            if(mp.containsKey(sum-k)) count+= mp.get(sum-k);
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}

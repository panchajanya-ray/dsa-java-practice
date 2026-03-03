// LeetCode Problem: 169. Majority Element
// Time Complexity: O(n), O(n^2) if hash crashes {rare}
// Space Complexity: O(n)

package hashing;

import java.util.HashMap;

public class MajorityElement {
	public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> freq = new HashMap<>();
        for(int num: nums)
        {
            if(freq.containsKey(num)) freq.replace(num,freq.get(num)+1);
            else freq.put(num,1);
        }

        for (int key : freq.keySet()) 
        {
            if(freq.get(key)>(nums.length/2)) return key;
        }
        return -1;
    }
}

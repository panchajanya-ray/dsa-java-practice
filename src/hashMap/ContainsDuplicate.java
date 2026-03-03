// LeetCode Problem: 217. Contains Duplicate
// Time Complexity: O(n)
// Space Complexity: O(n)

package hashMap;

import java.util.HashSet;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();
        for(int num: nums)
        {
            if(unique.contains(num)) return true;
            unique.add(num);
        }
        return false;
    }
}

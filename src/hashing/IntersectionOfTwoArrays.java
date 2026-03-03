// LeetCode Problem: 349. Intersection of Two Arrays
// Time Complexity: O(n + m), O((n + m)^2) if hash crashes {rare}
// Space Complexity: O(n + m)

package hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> intersectElt = new ArrayList<>();
        for (int num : nums2) set.add(num);

        for (int num : nums1) 
        {
            if (set.contains(num)) 
            {
                intersectElt.add(num);
                set.remove(num);
            }
        }

        return intersectElt.stream().mapToInt(Integer::intValue).toArray();
    }
}

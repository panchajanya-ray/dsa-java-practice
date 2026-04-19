// LeetCode Problem: 989. Add to Array-Form of Integer
// Pattern: Arrays
// Time Complexity: O(max(N, log{10} K))
// Space Complexity: O(max(N, log{10} K))

package array;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
	public List<Integer> addToArrayForm(int[] num, int K) {
        List<Integer> res = new ArrayList<>();
        for (int i = num.length - 1; i >= 0; i--) 
        {
            res.add((num[i] + K) % 10);
            K = (num[i] + K) / 10;
        }
        while (K > 0) 
        {
            res.add(K % 10);
            K /= 10;
        }
        return res.reversed();
    }
}

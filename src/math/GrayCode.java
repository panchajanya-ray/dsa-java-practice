// LeetCode 89. Gray Code
// Pattern: Math, Bit Manipulation
// Time Complexity: O(2^n)
// Space Complexity: O(1)

package math;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	public List<Integer> grayCode(int n) {
        List<Integer> output = new ArrayList<>();

        int total = 1 << n;

        for(int i=0;i<total;i++)
        {
            output.add(i^(i>>1));
        }

        return output;
    }
}

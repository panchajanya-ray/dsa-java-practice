// LeetCode 172. Factorial Trailing Zeroes
// Pattern: Math
// Time Complexity: O(log5 n)
// Space Complexity: O(1)

package math;

public class FactorialTrailingZeroes {
	public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) 
        {
            n /= 5;
            count += n;
        }
        return count;
    }
}

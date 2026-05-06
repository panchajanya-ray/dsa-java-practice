// LeetCode 400. Nth Digit
// Pattern: Math
// Time Complexity: O(log{10} n)
// Space Complexity: O(log{10} n)

package math;

public class NthDigit {
	public int findNthDigit(int n) {
        int len = 1;
        long countNum = 9; 
        int base = 1;

        while (n > len * countNum) 
        {
            n -= len * countNum;
            len++;
            countNum *= 10;
            base *= 10;
        }

        int num = base + (n - 1) / len;

        String s = Integer.toString(num);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }
}

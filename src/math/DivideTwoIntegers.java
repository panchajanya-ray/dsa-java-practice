// LeetCode 29. Divide Two Integers
// Pattern: Math, Modular Exponentiation
// Time Complexity: O(log^2 n)
// Space Complexity: O(1)

package math;

public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
	    if (dividend == Integer.MIN_VALUE && divisor == -1) {
	        return Integer.MAX_VALUE;
	    }

	    boolean negative = (dividend < 0) ^ (divisor < 0);

	    long n = Math.abs((long) dividend);
	    long d = Math.abs((long) divisor);
	    long ans = 0;

	    while (n >= d) {
	        int cnt = 0;
	        while (n >= (d << (cnt + 1))) {
	            cnt++;
	        }

	        ans += (1L << cnt);
	        n -= (d << cnt);
	    }

	    return negative ? (int) -ans : (int) ans;
	}
}

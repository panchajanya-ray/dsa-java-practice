// LeetCode 7. Reverse Integer
// Pattern: Number manipulation
// Time Complexity: O(d), d= number of digits
// Space Complexity: O(1)

package math;

public class ReverseInteger {
	public int reverse(int x) 
    {
        long rev = 0;
        long abs = Math.abs((long) x);

        while (abs > 0) 
        {
            rev = (rev * 10) + (abs % 10);
            abs = abs / 10;
        }

        if (x < 0) rev *= -1;

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) 
        {
            return 0;
        }

        return (int) rev;
    }
}

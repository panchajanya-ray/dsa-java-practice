// LeetCode 279. Perfect Squares
// Pattern: Math, Legendre's Theorem
// Time Complexity: O(sqrt(n))
// Space Complexity: O(1)

package math;

public class PerfectSquares {
	public int numSquares(int n) {
        
        int sqrtN = (int) Math.sqrt(n);

        if(sqrtN * sqrtN == n) return 1;

        for(int i=1;i*i<=n; i++)
        {
            int square = i*i;
            int base = (int) Math.sqrt(n - square);

            if(base * base == n-square) return 2;
        }

        while(n % 4 == 0) n /= 4;
        
        if(n % 8 != 7) return 3;

        return 4;
	}
}

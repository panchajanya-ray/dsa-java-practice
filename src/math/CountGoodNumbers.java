// LeetCode 1922. Count Good Numbers
// Pattern: Math, Modular Exponentiation
// Time Complexity: O(log n)
// Space Complexity: O(1)

package math;

public class CountGoodNumbers {
	long MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long evenPos = (n + 1) / 2;
        long oddPos = n / 2;
    
        long evenChoices = power(5, evenPos);
        long oddChoices = power(4, oddPos);
    
        return (int) ((evenChoices * oddChoices) % MOD);
    }

    public long power(long base, long exp) 
    {
        long res = 1;
        base %= MOD;
        while (exp > 0) 
        {
            if (exp % 2 == 1) res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp /= 2;
        }
        return res;
    }
}

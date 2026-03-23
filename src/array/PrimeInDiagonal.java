// LeetCode 2614. Prime In Diagonal
// Pattern: Array, Prime Number
// Time Complexity: O(n * √m)
// Space Complexity: O(1)

package array;

public class PrimeInDiagonal {
	public int diagonalPrime(int[][] nums) {
        int maxPrime=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if (nums[i][i] > maxPrime && isPrime(nums[i][i])) maxPrime= nums[i][i];
            if (nums[i][n - i - 1] > maxPrime && isPrime(nums[i][n - i - 1])) maxPrime = nums[i][n - i - 1];
        }
        return maxPrime;
    }

    public boolean isPrime(int n)
    {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) 
        {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}

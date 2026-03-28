// LeetCode 263. Ugly Number
// Pattern: Arrays
// Time Complexity: O(log n)
// Space Complexity: O(1)

package array;

public class UglyNumber {
	public boolean isUgly(int n) 
	{
	    if (n <= 0) return false;
	    
	    for (int p : new int[]{2, 3, 5}) 
	    {
	        while (n % p == 0) 
	        {
	            n /= p;
	        }
	    }
	    
	    return n == 1;
	}
}

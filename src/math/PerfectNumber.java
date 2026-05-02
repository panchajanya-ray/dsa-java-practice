// LeetCode 507. Perfect Number
// Pattern: Math
// Time Complexity: O(sqrt(n))
// Space Complexity: O(1)

package math;

public class PerfectNumber {
	public boolean checkPerfectNumber(int num) {
        if(num == 1) return false;
        
        int sum = 0;
        int sq = (int)Math.sqrt(num);
        for(int i = 1; i <= sq; i++) 
        {
            int a = num % i;
            int b = num / i;
            if(a == 0)
            {
                sum += i;
                if(b != i && b != num) sum += b;
            }
            if(sum > num) return false;
        }

        return sum == num;
    }
}

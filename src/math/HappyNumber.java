// LeetCode 202. Happy Number
// Pattern: Math
// Time Complexity: O(log n)
// Space Complexity: O(log n)

package math;

public class HappyNumber {
	public boolean isHappy(int n) {
        if(n==1) return true;
        if(n==4) return false;
        int num= sumOfSquares(n);
        return isHappy(num);
    }
    int sumOfSquares(int n){
        int sum=0;
         while(n>0){
            int rem=n%10;
            sum+=rem*rem;
            n/=10;
        }
        return sum;
    }
}

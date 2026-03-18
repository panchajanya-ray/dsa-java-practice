// LeetCode 2414. Length of the Longest Alphabetical Continuous Substring
// Pattern: Arrays
// Time Complexity: O(N)
// Space Complexity: O(1)

package string;

public class LengthOfTheLongestAlphabeticalContinuousSubstring {
	public int longestContinuousSubstring(String s) {
        int countChar=1;
        int maxLength=0;
        int n=s.length();
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i)-s.charAt(i-1)==1) countChar++;
            else
            {
                maxLength = Math.max(maxLength, countChar);
                countChar=1;
            }
        }
        return Math.max(maxLength, countChar);
    }
}

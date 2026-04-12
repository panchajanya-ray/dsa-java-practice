// LeetCode Problem: 1312. Minimum Insertion Steps to Make a String Palindrome
// Pattern: Dynamic programming, lcs Problem pattern
// Time Complexity: O(N^2)
// Space Complexity: O(N)

package dp;

public class MinimumInsertionStepsToMakeAStringPalindrome {
	public int minInsertions(String s) {
        String sRev = new StringBuilder(s).reverse().toString();
        int lenS = s.length();

        char []s1 = s.toCharArray();
        char []s2 = sRev.toCharArray();

        int dp[] = new int[lenS+1];
        for(int i=1;i<lenS+1;i++)
        {
            int curr[] = new int[lenS+1];
            for(int j=1;j<lenS+1;j++)
            {
                if(s1[i-1]==s2[j-1]) curr[j] = dp[j-1]+1;
                else
                {
                    curr[j] = Math.max(curr[j-1], dp[j]);
                }
            }
            dp = curr;
        }

        return lenS - dp[lenS];
    }
}

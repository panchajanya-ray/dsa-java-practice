// LeetCode Problem: 516. Longest Palindromic Subsequence
// Pattern: Dynamic programming, lcs Problem pattern
// Time Complexity: O(N * M)
// Space Complexity: O(N * M)

package dp;

public class LongestPalindromicSubsequence {
	public int longestPalindromeSubseq(String s) {
        String sRev = new StringBuilder(s).reverse().toString();
        int lenS = s.length();

        char []s1 = s.toCharArray();
        char []s2 = sRev.toCharArray();

        int dp[][] = new int[lenS+1][lenS+1];
        for(int i=1;i<lenS+1;i++)
        {
            for(int j=1;j<lenS+1;j++)
            {
                if(s1[i-1]==s2[j-1]) dp[i][j] = dp[i-1][j-1]+1;
                else
                {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        return dp[lenS][lenS];
    }
}

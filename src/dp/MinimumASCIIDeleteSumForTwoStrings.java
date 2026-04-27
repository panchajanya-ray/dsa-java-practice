// LeetCode 712. Minimum ASCII Delete Sum for Two Strings
// Pattern: Dynamic Programming, LCS Pattern Problem
// Time Complexity: O(n1 * n2)
// Space Complexity: O(n2)

package dp;

public class MinimumASCIIDeleteSumForTwoStrings {
	public int minimumDeleteSum(String s1, String s2) {
        if(s1.equals(s2)) return 0;
        int n1 = s1.length();
        int n2 = s2.length();

        int dp[] = new int[n2+1];
        for(int i = 1; i <= n1; i++)
        {
            int curr[] = new int[n2+1];
            for(int j = 1; j<= n2; j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1)) curr[j] = dp[j-1]+ s1.charAt(i-1);
                else curr[j] = Math.max(dp[j], curr[j-1]);
            }
            dp = curr;
        }

        int totalASCII = 0;
        for(int i = 0; i < n1; i++) totalASCII += s1.charAt(i);
        for(int j = 0; j < n2; j++) totalASCII += s2.charAt(j);

        return totalASCII - 2 * dp[n2];
    }
}

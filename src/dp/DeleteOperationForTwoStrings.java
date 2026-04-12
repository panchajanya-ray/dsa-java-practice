// LeetCode Problem: 583. Delete Operation for Two Strings
// Pattern: Dynamic programming, lcs Problem pattern
// Time Complexity: O(N * M)
// Space Complexity: O(M)

package dp;

public class DeleteOperationForTwoStrings {
	public int minDistance(String word1, String word2) {
        int lcs = lcs(word1,word2);
        return (word1.length() - lcs) + (word2.length() - lcs);
    }

    public int lcs(String s1, String s2)
    {
        int lenS1 = s1.length();
        int lenS2 = s2.length();

        int dp[] = new int[lenS2+1];
        for(int i=1;i<lenS1+1;i++)
        {
            int curr[] = new int[lenS2+1];
            for(int j=1;j<lenS2+1;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1)) curr[j] = dp[j-1]+1;
                else
                {
                    curr[j] = Math.max(curr[j-1], dp[j]);
                }
            }
            dp = curr;
        }

        return dp[lenS2];
    }
}

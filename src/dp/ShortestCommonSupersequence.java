// LeetCode Problem: 1092. Shortest Common Supersequence
// Pattern: Dynamic programming
// Time Complexity: O(N * M)
// Space Complexity: O(N * M)
 
package dp;

public class ShortestCommonSupersequence {
	public static String shortestCommonSupersequence(String str1, String str2){
        int str1Len = str1.length();
        int str2Len = str2.length();

        int dp[][] = new int[str1Len+1][str2Len+1];

        for(int i=1;i<str1Len+1;i++)
        {
            for(int j=1;j<str2Len+1;j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1)) dp[i][j] = dp[i-1][j-1]+1;
                else dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }

        StringBuilder res = new StringBuilder();
        int i = str1Len;
        int j = str2Len;
        while(i>0 && j>0)
        {
            if(str1.charAt(i-1)==str2.charAt(j-1))
            {
                res.append(str1.charAt(i-1));
                i--;
                j--;
            }
            else
            {
                if(dp[i][j-1] > dp[i-1][j]) 
                {
                    res.append(str2.charAt(j-1));
                    j--;
                }
                else
                {
                    res.append(str1.charAt(i-1));
                    i--;
                }
            }
        }
        while(i>0)
        {
            res.append(str1.charAt(i-1));
            i--;
        }
        while(j>0)
        {
            res.append(str2.charAt(j-1));
            j--;
        }

        return res.reverse().toString();
    }
	
	/*
    public static String shortestCommonSupersequence(String str1, String str2) {
        String lcsStr = lcs(str1,str2);
        int lcsStrLen = lcsStr.length();
        int str1Len = str1.length();
        int str2Len = str2.length();
        int scsStrLen = str1Len + (str2Len - lcsStrLen);
        String scsStr = "";
        int i=0;
        int j=0;
        int k=0;
        for (int l = 0; l < scsStrLen; l++) 
        {
            if (k < lcsStrLen && i < str1Len && j < str2Len && 
                str1.charAt(i) == lcsStr.charAt(k) && str2.charAt(j) == lcsStr.charAt(k)) 
            {
                scsStr += str1.charAt(i);
                i++; j++; k++;
            } 
            else if (i < str1Len && (k == lcsStrLen || str1.charAt(i) != lcsStr.charAt(k))) 
            {
                scsStr += str1.charAt(i++);
            } 
            else if (j < str2Len) {
                scsStr += str2.charAt(j++);
            }
        }
        return scsStr;
    }

    public static String lcs(String s1, String s2)
    {
        int lenS1 = s1.length();
        int lenS2 = s2.length();

        String dp[] = new String[lenS2+1];
        Arrays.fill(dp,"");
        for(int i=1;i<lenS1+1;i++)
        {
            String curr[] = new String[lenS2+1];
            Arrays.fill(curr,"");
            for(int j=1;j<lenS2+1;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1)) curr[j] = dp[j-1] + s1.charAt(i-1);
                else
                {
                    curr[j] = curr[j-1].length()>dp[j].length() ? curr[j-1] : dp[j];
                }
            }
            dp = curr;
        }

        return dp[lenS2];
    }
    */
}

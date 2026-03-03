// LeetCode Problem: 14. Longest Common Prefix
// Time Complexity: O(S) S= Sum of characters in all the string
// Space Complexity: O(1)


package string;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(strs[0])!=0)
            {
                strs[0] = strs[0].substring(0,strs[0].length()-1);
                if(strs[0].isEmpty()) return "";
            }
        }
        return strs[0];
    }
}

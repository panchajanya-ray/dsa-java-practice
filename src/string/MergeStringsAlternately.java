// LeetCode 1768. Merge Strings Alternately
// Pattern: String
// Time Complexity: O(log(max(l1, l2))), l1 & l2 are lengths of word1 & word2 respectively 
// Space Complexity: O(1)

package string;

public class MergeStringsAlternately {
	public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=0;
        while(i<word1.length() || j<word2.length())
        {
            if(i<word1.length()) sb.append(word1.charAt(i++));
            if(j<word2.length()) sb.append(word2.charAt(j++));
        }

        return sb.toString();
    }
}

// LeetCode 2390. Removing Stars From a String
// Pattern: String
// Time Complexity: O(n)
// Space Complexity: O(n)

package string;

public class RemovingStarsFromAString {
	public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        /*int n = s.length();
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(ch=='*') sb.deleteCharAt(sb.length() - 1);
            else sb.append(ch);
        }*/

        for(char ch: s.toCharArray())
        {
            if(ch=='*') sb.deleteCharAt(sb.length() - 1);
            else sb.append(ch);
        }
        return sb.toString();
    }
}

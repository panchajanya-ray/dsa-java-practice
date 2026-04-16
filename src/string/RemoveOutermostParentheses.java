// LeetCode 1021. Remove Outermost Parentheses
// Pattern: String
// Time Complexity: O(n)
// Space Complexity: O(n)

package string;

public class RemoveOutermostParentheses {
	public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int opened = 0;
        for(char ch: s.toCharArray())
        {
            if((ch == '(' && opened++ > 0) || (ch == ')' && opened-- > 1)) res.append(ch);
        }
        return res.toString();
    }
}

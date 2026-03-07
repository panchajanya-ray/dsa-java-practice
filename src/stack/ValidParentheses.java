// LeetCode 20. Valid Parentheses
// Pattern: Stack
// Time Complexity: O(n)
// Space Complexity: O(n)

package stack;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch: s.toCharArray())
        {
            switch(ch)
            {
                case '(':
                case '{':
                case '[':
                    st.push(ch);
                    break;
                case ')':
                    if(st.isEmpty() || st.pop()!='(') return false;
                    break;
                case '}':
                    if(st.isEmpty() || st.pop()!='{') return false;
                    break;
                case ']':
                    if(st.isEmpty() || st.pop()!='[') return false;
                    break;
            }
        }
        if(st.isEmpty()) return true;
        else return false;
    }
}

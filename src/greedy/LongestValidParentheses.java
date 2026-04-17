// LeetCode 32. Longest Valid Parentheses
// Pattern: Greedy (Two - Pass)
// Time Complexity: O(n)
// Space Complexity: O(1)

package greedy;

// import java.util.Stack;

public class LongestValidParentheses {
	public int longestValidParentheses(String s) {
        int l=0;
        int r=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(') l++; 
            else r++;

            if(l==r) max=Math.max(max,l*2);
            else if(l<r)
            {
                l=0;
                r=0;
            }
        }

        l=0;
        r=0;
        for(int i=s.length()-1;i>=0;i--)
        { 
            if(s.charAt(i)=='(') l++;
            else r++;

            if(l==r) max=Math.max(max,l*2);
            else if(r<l)
            {
                l=0;
                r=0;
            }
        }
        return max;
    }

    /*
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);

            if(c == '(') stack.push(i);
            else 
            {
                stack.pop();
                if(stack.isEmpty()) stack.push(i);
                else 
                {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }
    */
}

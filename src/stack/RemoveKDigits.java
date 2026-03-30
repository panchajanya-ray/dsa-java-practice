// LeetCode 402. Remove K Digits
// Pattern: Stack
// Time Complexity: O(n)
// Space Complexity: O(n)

package stack;

import java.util.Stack;

public class RemoveKDigits {
	public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<>();
        for(char ch: num.toCharArray())
        {
            while(!stk.isEmpty() && k>0 && stk.peek() > ch)
            {
                stk.pop();
                k--;
            }
            stk.push(ch);
        }

        while(k>0 && !stk.isEmpty())
        {
            stk.pop();
            k--;
        }

        StringBuilder ans=new StringBuilder();
        for(char ch: stk) ans.append(ch);
        while(ans.length() > 1 && ans.charAt(0) == '0')
        {
            ans.deleteCharAt(0);
        }

        return ans.length() == 0 ? "0" : ans.toString();

    }
}

// LeetCode 394. Decode String
// Pattern: Stack, repeat string
// Time Complexity: O(Decoded Length)
// Space Complexity: O(Decoded Length)

package stack;

import java.util.Stack;

public class DecodeString {
	public String decodeString(String s) {
        if (s.length() < 3) 
        {
            return s;
        }
        Stack<Character> stk = new Stack<>();
        
        for (char ch : s.toCharArray()) 
        {
            if (ch == ']') 
            {
                StringBuilder sb = new StringBuilder();
                while (!stk.isEmpty() && stk.peek() != '[') sb.append(stk.pop());
                stk.pop();

                StringBuilder numStr = new StringBuilder();
                while (!stk.isEmpty() && Character.isDigit(stk.peek())) numStr.append(stk.pop());
                
                int num = Integer.parseInt(numStr.reverse().toString());

                String repeated = sb.reverse().toString().repeat(num);
                for (char c : repeated.toCharArray()) stk.push(c);
                   
            }
            else 
            {
                stk.push(ch);
            }
        }

        StringBuilder output = new StringBuilder();
        while (!stk.isEmpty()) output.append(stk.pop());
        return output.reverse().toString();
    }
}

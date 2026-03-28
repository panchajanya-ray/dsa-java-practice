// LeetCode 150. Evaluate Reverse Polish Notation
// Pattern: String
// Time Complexity: O(log n)
// Space Complexity: O(1)

package stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	public int evalRPN(String[] tokens) {
	    Stack<Integer> stk = new Stack<>();
	    for (String str : tokens) 
	    {
	        if (Character.isDigit(str.charAt(0)) || str.length() > 1) 
	        {
	            stk.push(Integer.parseInt(str));
	        } 
	        else 
	        {
	            int n1 = stk.pop();
	            int n2 = stk.pop();
	            switch (str) 
	            {
	                case "+": stk.push(n2 + n1); break;
	                case "-": stk.push(n2 - n1); break;
	                case "*": stk.push(n2 * n1); break;
	                case "/": stk.push(n2 / n1); break;
	            }
	        }
	    }
	    return stk.pop();
	}
}

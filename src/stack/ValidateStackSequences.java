// LeetCode 946. Validate Stack Sequences
// Pattern: Stack
// Time Complexity: O(n)
// Space Complexity: O(1)

package stack;

import java.util.Stack;

public class ValidateStackSequences {
	public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stk = new Stack<>();
        int j = 0;
        int n = pushed.length;
        for(int i = 0; i < n; i++)
        {
            stk.push(pushed[i]);
            while(j < n && !stk.isEmpty() && popped[j] == stk.peek())
            {
                stk.pop();
                j++;
            }
        }
        return stk.isEmpty();
    }
}

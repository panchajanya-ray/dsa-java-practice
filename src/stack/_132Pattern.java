// LeetCode 456. 132 Pattern
// Pattern: Stack
// Time Complexity: O(log5 n)
// Space Complexity: O(n)

package stack;

import java.util.Stack;

public class _132Pattern {
	public boolean find132pattern(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        int c = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=n-1; i>=0; i--)
        {
            if(nums[i]<c) return true;
            while(!stk.isEmpty() && stk.peek() < nums[i]) c = stk.pop();
            stk.push(nums[i]);
        }
        return false;
    }
}

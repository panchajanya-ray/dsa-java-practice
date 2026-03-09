// LeetCode 503. Next Greater Element II
// Pattern: Stack
// Time Complexity: O(n)
// Space Complexity: O(n)

package stack;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementII {
	public static int[] nextGreaterElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stk = new Stack<>();
        int[] greaterValue = new int[nums.length];
        
        for(int i =0;i<nums.length;i++)
        {
        	while(!stk.isEmpty() && nums[stk.peek()]<nums[i]) map.put(stk.pop(),nums[i]);
            stk.push(i);
        }
        
        for(int i =0;i<nums.length;i++)
        {
            while(!stk.isEmpty() && nums[stk.peek()]<nums[i]) map.put(stk.pop(),nums[i]);
        }
        while(!stk.isEmpty()) map.put(stk.pop(),-1);
        
        for(int i=0;i<nums.length;i++) greaterValue[i] = map.get(i);
        	        
        return greaterValue;
    }
}

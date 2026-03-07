// LeetCode 739. Daily Temperatures
// Pattern: Stack
// Time Complexity: O(n)
// Space Complexity: O(n)

package stack;

import java.util.Stack;

public class DailyTemperatures {
	public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int [] ans = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++)
        {
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i])
            {
                int previousIndex = st.pop();
                ans[previousIndex] = i - previousIndex;
            }
            st.push(i);
        }
        return ans;
    }
}

// LeetCode 84. Largest Rectangle in Histogram
// Pattern: Stack
// Time Complexity: O(n)
// Space Complexity: O(n)

package stack;

import java.util.Stack;

public class LargestRectangleInHistogram {
	public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int left[] = new int[n];
        int right[] = new int[n];
        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<n;i++)
        {
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i]) stk.pop();
            left[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }

        stk.clear();

        for(int i=n-1; i>=0; i--)
        {
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i]) stk.pop();
            right[i] = stk.isEmpty() ? n : stk.peek();
            stk.push(i);
        }

        int maxArea=0;
        for(int i=0;i<n;i++)
        {
            int width = right[i] - left[i] -1;
            maxArea = Math.max(maxArea, (heights[i]*width)); 
        }
        return maxArea;
    }
}

// LeetCode 901. Online Stock Span
// Pattern: Stack/ Monotonic Stack
// Time Complexity: O(1) amortized per next() call
// Space Complexity: O(n)

package stack;

import java.util.Stack;

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

public class OnlineStockSpan {
	Stack<int[]> stk;

    public void StockSpanner() {
        stk = new Stack<>();
    }
    
    public int next(int price) {
        int span=1;
        while(!stk.isEmpty() && stk.peek()[0] <= price) span += stk.pop()[1];
        stk.push(new int[] {price, span});
        return span;
    }
}

// LeetCode 155. Min Stack
// Pattern: Stack
// Time Complexity: O(1) for push, pop, top, getMin
// Space Complexity: O(n)

package stack;

import java.util.Stack;

public class MinStack {
	Stack<Integer> s = new Stack<>(), st=new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        s.push(val);
        if(st.isEmpty() || val <= st.peek()) st.push(val);
    }
    
    public void pop() {
        if(s.peek().equals(st.peek())) st.pop();
        s.pop();
    }
    
    public int top() {
        if(s.isEmpty()) return -1;
        return s.peek();
    }
    
    public int getMin() {
        if(st.isEmpty()) return -1;
        return st.peek();
    }
}

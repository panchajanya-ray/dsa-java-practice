// LeetCode 735. Asteroid Collision
// Pattern: Stack
// Time Complexity: O(n)
// Space Complexity: O(n)

package stack;

import java.util.Stack;

public class AsteroidCollision {
	public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        if(asteroids.length == 0) return null;
        
        for (int ast : asteroids) {
            boolean destroyed = false;
            while (!stk.isEmpty() && stk.peek() > 0 && ast < 0) {
                int top = stk.peek();
                int asteroid = Math.abs(ast);
                if (top < asteroid) {
                    stk.pop();
                    continue;
                } else if (top == asteroid) {
                    stk.pop();
                }
                destroyed = true; 
                break;
            }
            
            if (!destroyed) {
                stk.push(ast);
            }
        }
        int[] result = new int[stk.size()];
        for (int i = 0; i < stk.size(); i++) result[i] = stk.get(i);
        return result;
    }
}

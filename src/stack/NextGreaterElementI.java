// LeetCode 496. Next Greater Element I
// Pattern: Stack
// Time Complexity: O(n + m)
// Space Complexity: O(m)

package stack;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap <Integer, Integer> greater = new HashMap<>();
        Stack<Integer> stk = new Stack();
        int [] greaterElt = new int[nums1.length];
        for(int num:nums2)
        {
            while(!stk.isEmpty() && stk.peek()<num) greater.put(stk.pop(),num);
            stk.push(num); 
        }
        while(!stk.isEmpty()) greater.put(stk.pop(),-1);
        for(int i=0;i<nums1.length;i++) greaterElt[i] = greater.get(nums1[i]);
        return greaterElt;
    }
}

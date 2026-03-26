// LeetCode 445. Add Two Numbers II
// Pattern: Singly Linked List
// Time Complexity: O(n + m)
// Space Complexity: O(n + m)

package linkedList;

import java.util.Stack;

public class AddTwoNumbersII {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> num1 = new Stack<>();
        Stack<Integer> num2 = new Stack<>();

        while(l1!=null && l2!=null)
        {
            num1.push(l1.val);
            l1=l1.next;

            num2.push(l2.val);
            l2=l2.next;
        }
        while(l1!=null)
        {
            num1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null)
        {
            num2.push(l2.val);
            l2=l2.next;
        }

        int sum = 0;
        ListNode current = null;

        while (!num1.isEmpty() || !num2.isEmpty() || sum > 0) 
        {
            if (!num1.isEmpty()) sum += num1.pop();
            if (!num2.isEmpty()) sum += num2.pop();
    
            ListNode node = new ListNode(sum % 10);
            sum /= 10;
    
            node.next = current;
            current = node;
        }

        return current;
    }
}

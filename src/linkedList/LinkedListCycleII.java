// LeetCode 142. Linked List Cycle II
// Pattern: Singly Linked list, Fast and Slow Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)

package linkedList;

//Definition for singly-linked list.
/*
class ListNode {
	 int val;
ListNode next;
ListNode() {}
ListNode(int val) { this.val = val; }
ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
*/

public class LinkedListCycleII {
	public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;

        ListNode slow;
        ListNode fast;
        slow = fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) break;
        }

        if(fast!=slow) return null;
        
        fast = head;
        while(fast != slow)
        {
            fast=fast.next;
            slow=slow.next;
        } 
        return fast;
    }
}

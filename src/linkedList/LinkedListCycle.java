// LeetCode 141. Linked List Cycle
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

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        ListNode slow;
        ListNode fast;
        if(head==null||head.next==null) return false;
        slow = fast = head;
        while(fast != null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}

// LeetCode 143. Reorder List
// Pattern: Linked List
// Time Complexity: O(n)
// Space Complexity: O(1)

package linkedList;

public class ReorderList {
	public void reorderList(ListNode head) {
        if(head==null) return;
        
        // finding mid point
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        // inverse the 2nd half
        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;

        while(second!=null)
        {
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }
        
        // merging both the half
        ListNode first = head;
        second = prev;

        while(second!=null)
        {
            ListNode temp1 = first.next, temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}

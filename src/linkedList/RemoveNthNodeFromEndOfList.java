// LeetCode 19. Remove Nth Node From End of List
// Pattern: Singly Linked List
// Time Complexity: O(L), L = length of linked list
// Space Complexity: O(1)

package linkedList;

public class RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
	    ListNode dummy = new ListNode(0);
	    dummy.next = head;

	    int size = 0;
	    ListNode curr = head;
	    while (curr != null) 
	    {
	        size++;
	        curr = curr.next;
	    }
	    
	    int toIndex = size - n;
	    curr = dummy;
	    for (int i = 0; i < toIndex; i++) 
	    {
	        curr = curr.next;
	    }
	    
	    
	    curr.next = curr.next.next;
	    
	    return dummy.next;
	}
}

// LeetCode 206. Reverse Linked List
// Pattern: Singly Linked List
// Time Complexity: O(n)
// Space Complexity: O(1)

package linkedList;


 // Definition for singly-linked list.
 class ListNode {
	 int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null, next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}

// LeetCode 876. Middle of the Linked List
// Pattern: Singly Linked List
// Time Complexity: O(n)
// Space Complexity: O(1)

package linkedList;

// Definition for singly-linked list.
/*
class ListNode {
	 int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
*/

public class MiddleOfTheLinkedList {
	public ListNode middleNode(ListNode head) {
        
        if(head == null) return head;
        ListNode p1;
        ListNode p2;

        p1=p2=head;
        while(p2.next != null)
        {
            p1=p1.next;
            p2=p2.next;
            if(p2.next== null) break;
            p2=p2.next;
        }
        return p1;
    }
}

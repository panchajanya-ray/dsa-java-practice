// LeetCode 2487. Remove Nodes From Linked List
// Pattern: Linked List, reverse
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

public class RemoveNodesFromLinkedList {
	public ListNode removeNodes(ListNode head) {
        head = reverseList(head);

        int maxVal = head.val;
        ListNode curr = head;

        while(curr != null && curr.next != null)
        {
            if(curr.next.val < maxVal) curr.next = curr.next.next;
            else 
            {
                curr = curr.next;
                maxVal = curr.val;
            }
        }

        return reverseList(head);
    }

    public ListNode reverseList(ListNode head) 
    {
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        } 

        return prev;
    }
}

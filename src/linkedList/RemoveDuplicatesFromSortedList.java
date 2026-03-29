// LeetCode 83. Remove Duplicates from Sorted List
// Pattern: Singly Linked List, two pointer
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

public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode p1 = head;
        ListNode p2 = p1.next;

        while(p2!=null)
        {
            if(p1.val == p2.val) p2=p2.next;
            else
            {
                p1.next=p2;
                p1=p1.next;
                p2=p2.next;
            }
        }
        p1.next=null;
        return head;
    }
}

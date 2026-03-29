// LeetCode 160. Intersection of Two Linked Lists
// Pattern: Linked List
// Time Complexity: O(m + n)
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

public class IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode lista = headA;
        ListNode listb = headB;

        while (lista != listb) {
            lista = (lista != null) ? lista.next : headB;
            listb = (listb != null) ? listb.next : headA;
        }

        return lista; 
    }
}

// LeetCode 21. Merge Two Sorted Lists
// Pattern: Singly Linked list, Sorted Merge
// Time Complexity: O(n + m)
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

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode sorted = head;
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                sorted.next=list1;
                list1=list1.next;
            }
            else
            {
                sorted.next=list2;
                list2=list2.next;
            }
            sorted=sorted.next;
        }

        while(list1!=null)
        {
            sorted.next=list1;
            list1=list1.next;
            sorted=sorted.next;
        }
        while(list2!=null)
        {
            sorted.next=list2;
            list2=list2.next;
            sorted=sorted.next;
        }
        return head.next; //since head.val = dummy = 0
    }
}

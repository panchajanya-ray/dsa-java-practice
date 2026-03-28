// LeetCode 234. Palindrome Linked List
// Pattern: Singly Linked List, fast and slow pointer
// Time Complexity: O(n)
// Space Complexity: O(1)

package linkedList;

public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode head2= slow;

        ListNode curr = head2, prev = null, next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head2 = prev;

        ListNode curr1 = head;
        ListNode curr2 = head2;
        while(curr2!=null)
        {
            if(curr1.val!=curr2.val) return false;
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return true;
    }
}

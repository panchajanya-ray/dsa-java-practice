// LeetCode 2807. Insert Greatest Common Divisors in Linked List
// Pattern: Singly Linked List, GCD
// Time Complexity: O(n * log(min(a,b)))
// Space Complexity: O(1) or O(log(min(a,b))

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

public class InsertGreatestCommonDivisorsInLinkedList {
	public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode first = head;
        ListNode last = first.next;
        while(last!=null)
        {
            ListNode gcd = new ListNode(findGCD(first.val,last.val));
            gcd.next = last;
            first.next=gcd;
            first=last;
            last=last.next;
        }
        return head;
    }
	
    public static int findGCD(int a, int b) 
    {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
}

// LeetCode 2. Add Two Numbers
// Pattern: Singly Linked list
// Time Complexity: O(max(n,m))
// Space Complexity: O(max(n,m))

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

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        int sum=0;
        ListNode list = head;
        while(l1!=null && l2!=null)
        {
            ListNode node = new ListNode();
            sum=sum+l1.val+l2.val;
            node.val=(sum)%10;
            node.next = null;
            sum/=10;
            list.next=node;
            list=list.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null)
        {
            ListNode node = new ListNode();
            sum=sum+l1.val;
            node.val=(sum)%10;
            node.next = null;
            sum/=10;
            list.next=node;
            list=list.next;
            l1=l1.next;
        }
        while(l2!=null)
        {
            ListNode node = new ListNode();
            sum=sum+l2.val;
            node.val=(sum)%10;
            node.next = null;
            sum/=10;
            list.next=node;
            list=list.next;
            l2=l2.next;
        }
        if(sum!=0) 
        {
            ListNode node = new ListNode();
            node.val=sum;
            node.next=null;
            list.next=node;
            list=list.next;
        }
        return head.next; //since head.val = dummy = 0
    }
}

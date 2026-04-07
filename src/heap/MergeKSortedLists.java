// LeetCode 23. Merge k Sorted Lists
// Pattern: Min Heap, Linked List
// Time Complexity: O(n log k)
// Space Complexity: O(k)

package heap;

import java.util.PriorityQueue;

//Definition for singly-linked list.
class ListNode {
	 int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeKSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>((l1, l2) -> l1.val-l2.val);
        for(int i=0; i<lists.length; i++) {
            if(lists[i]!=null){
                priorityQueue.add(lists[i]);
            }
        }
        ListNode temp = null;
        ListNode head = null;
        while(!priorityQueue.isEmpty()) {
            if(temp == null){
                temp=priorityQueue.poll();
                head=temp;
            }
            else{
                temp.next=priorityQueue.poll();
                temp=temp.next;
            }
            if(temp.next != null){
                priorityQueue.add(temp.next);
            }
        }
        return head;

        /*
        int n = lists.length;
        if(n<2) return n==0 ? null : lists[0];
        ListNode l1 = lists[0];
        ListNode l2 = lists[1];
        ListNode merge = merge(l1,l2);
        for(int i=2;i<n;i++)
        {
            merge = merge(merge,lists[i]);
        }
        return merge;
        */
    }

    /*
    public ListNode merge(ListNode l1, ListNode l2)
    {
        ListNode merge = new ListNode(0);
        ListNode curr = merge;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                ListNode node = new ListNode();
                node.val = l1.val;
                node.next = null;
                curr.next=node;
                curr=curr.next;
                l1=l1.next;
            }
            else
            {
                ListNode node = new ListNode();
                node.val = l2.val;
                node.next = null;
                curr.next=node;
                curr=curr.next;
                l2=l2.next;
            }
        }
        while(l1!=null)
        {
            ListNode node = new ListNode();
            node.val = l1.val;
            node.next = null;
            curr.next=node;
            curr=curr.next;
            l1=l1.next;
        }
        while(l2!=null)
        {
            ListNode node = new ListNode();
            node.val = l2.val;
            node.next = null;
            curr.next=node;
            curr=curr.next;
            l2=l2.next;
        }
        return merge.next;
    }
    */
}

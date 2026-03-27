// LeetCode 146. LRU Cache
// Pattern: Doubly Linked List, Hash Map
// Time Complexity: O(1)
// Space Complexity: O(capacity)

package linkedList;

import java.util.HashMap;
import java.util.Map;

class LNode {
    int key, value;
    LNode prev, next;
    LNode(int key, int value)
    {
        this.key = key;
        this.value = value;
    }
}

public class LRUCache {
	private final int capacity;
    private final Map<Integer, LNode> map;
    private final LNode head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        head = new LNode(0,0);
        tail = new LNode(0,0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        LNode node = map.get(key);
        remove(node);
        insertAtFront(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            LNode node = map.get(key);
            node.value = value;
            remove(node);
            insertAtFront(node);
        }
        else
        {
            if(map.size()==capacity)
            {
                LNode lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
            }
            LNode newNode = new LNode(key, value);
            insertAtFront(newNode);
            map.put(key, newNode);
        }
    }

    private void remove(LNode node)
    {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertAtFront(LNode node)
    {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}

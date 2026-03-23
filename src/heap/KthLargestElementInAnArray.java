// LeetCode 215. Kth Largest Element in an Array
// Pattern: Min Heap
// Time Complexity: O(n log k)
// Space Complexity: O(k)

package heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
	public int findKthLargest(int[] nums, int k) {
        /*
		Arrays.sort(nums);
        return nums[nums.length - k];
        */
		
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int n: nums)
        {
            heap.add(n);

            if(heap.size() > k) heap.poll();
        }
        return heap.poll();
    }
}

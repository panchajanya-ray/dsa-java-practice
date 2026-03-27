// LeetCode 2407. Longest Increasing Subsequence II
// Pattern: Dynamic Programming, The Segment Tree Approach
// Time Complexity: O(n log M)
// Space Complexity: O(n)

package dp;

public class LongestIncreasingSubsequenceII {
	int[] tree;
    int n;

    public int lengthOfLIS(int[] nums, int k) {
        int maxVal = 0;
        for (int x : nums) maxVal = Math.max(maxVal, x);
        
        // Segment tree size: 4 * max value in nums
        n = maxVal;
        tree = new int[4 * n + 1];
        int overallMax = 0;

        for (int x : nums) {
            // Find max in range [max(1, x-k), x-1]
            int prevMax = query(1, 1, n, Math.max(1, x - k), x - 1);
            int currentLength = prevMax + 1;
            overallMax = Math.max(overallMax, currentLength);
            
            // Update the tree at position x with currentLength
            update(1, 1, n, x, currentLength);
        }

        return overallMax;
    }

    // Standard Point Update: Update value at idx
    private void update(int node, int start, int end, int idx, int val) {
        if (start == end) {
            tree[node] = Math.max(tree[node], val);
            return;
        }
        int mid = (start + end) / 2;
        if (idx <= mid) update(2 * node, start, mid, idx, val);
        else update(2 * node + 1, mid + 1, end, idx, val);
        tree[node] = Math.max(tree[2 * node], tree[2 * node + 1]);
    }

    // Standard Range Query: Get max in [l, r]
    private int query(int node, int start, int end, int l, int r) {
        if (r < start || end < l) return 0;
        if (l <= start && end <= r) return tree[node];
        int mid = (start + end) / 2;
        return Math.max(query(2 * node, start, mid, l, r), 
                        query(2 * node + 1, mid + 1, end, l, r));
    }
}

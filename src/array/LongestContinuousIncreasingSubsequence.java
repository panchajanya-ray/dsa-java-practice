// LeetCode 674. Longest Continuous Increasing Subsequence
// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

package array;

public class LongestContinuousIncreasingSubsequence {
	public int findLengthOfLCIS(int[] arr) {
        int max = 1, curr = 1, n = arr.length;
        if(n==1) return 1;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] < arr[i]) {
                curr++;
                max = Math.max(max, curr);
            } else {
                curr = 1;
            }
        }
        return max;
    }
}

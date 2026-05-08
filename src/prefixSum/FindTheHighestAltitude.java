// LeetCode 1732. Find the Highest Altitude
// Pattern: Prefix Sum
// Time Complexity: O(n)
// Space Complexity: O(n)

package prefixSum;

public class FindTheHighestAltitude {
	public int largestAltitude(int[] gain) {
        int max = 0;
        int n = gain.length;
        int prefix[] = new int[n+1];
        for(int i = 1; i < n+1; i++)
        {
            prefix[i] = prefix[i-1] + gain[i-1];
            max = Math.max(max, prefix[i]);
        }
        return max;
    }
}

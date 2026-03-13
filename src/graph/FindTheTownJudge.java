// LeetCode 997. Find the Town Judge
// Pattern: Graph, Indegree, Outdegree
// Time Complexity: O(n + m)
// Space Complexity: O(n)

package graph;

public class FindTheTownJudge {
	public int findJudge(int n, int[][] trust) {
        int[] count = new int[n+1];
        for (int[] t: trust) {
            count[t[0]]--;
            count[t[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (count[i] == n - 1) return i;
        }
        return -1;
    }
}

// LeetCode Problem: 887. Super Egg Drop
// Pattern: Dynamic programming
// Time Complexity: O(K * moves)
// Space Complexity: O(K)

package dp;

public class SuperEggDrop {
	public int superEggDrop(int k, int n) {
        int[] dp = new int[k + 1];
        int moves = 0;

        while (dp[k] < n)
        {
            moves++;
            for (int eggs = k; eggs >= 1; eggs--) 
            {
                dp[eggs] = dp[eggs] + dp[eggs - 1] + 1;
            }
        }

        return moves;
    }

    /*
    int t[][] = new int[101][10001];

    public int superEggDrop(int k, int n) {
        for (int[] row : t) Arrays.fill(row, -1);
        return solve(k, n);
    }

    int solve(int e, int f) {
        if (f <= 1 || e == 1) return f;
        if (t[e][f] != -1) return t[e][f];

        int min = Integer.MAX_VALUE;
        
        int low = 1, high = f;
        while (low <= high) 
        {
            int mid = (low + high) / 2;
            int breakCase = solve(e - 1, mid - 1);
            int safeCase = solve(e, f - mid);
            
            int temp = 1 + Math.max(breakCase, safeCase);
            min = Math.min(min, temp);
            
            if (breakCase < safeCase) low = mid + 1;
            else high = mid - 1;
        }
        
        return t[e][f] = min;
    }
    */
}

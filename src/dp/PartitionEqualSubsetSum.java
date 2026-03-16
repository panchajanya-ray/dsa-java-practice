// LeetCode 416. Partition Equal Subset Sum
// Pattern: Dynamic Programming, 0/1 Knapsack, Sum of Subset Problem
// Time Complexity: O(n * S), S = Sum/2
// Space Complexity: O(n)

package dp;

public class PartitionEqualSubsetSum {
	public boolean canPartition(int[] nums) {
        // int n= nums.length;
        int sum=0;
        for(int num: nums) sum+= num;
        
        if(sum%2 != 0) return false;

        /*
        boolean t[][] = new boolean[n+1][sum/2+1];

        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<(sum/2+1);j++)
            {
                if(i==0) t[i][j]=false;
                if(j==0) t[i][j]=true;
            }
        }

        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<(sum/2+1);j++)
            {
                if(nums[i-1]<=j)
                {
                    t[i][j] = t[i-1][j] || t[i-1][j-nums[i-1]];
                }
                else
                {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        */

        boolean t[] = new boolean[sum/2+1];
        t[0] = true;

        for(int num:nums)
        {
            for(int j=sum/2;j>=num;j--)
            {
                t[j] = t[j] || t[j-num];  
            }
        }
        return t[sum/2];
    }
}

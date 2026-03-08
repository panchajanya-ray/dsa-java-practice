//LeetCode 45. Jump Game II
//Pattern: Greedy
// Time Complexity: O(n)
// Space Complexity: O(1)

package greedy;

public class JumpGameII {
	public int jump(int[] nums) {
        if(nums.length == 1) return 0;
        int farthest = nums[0];
        int jumps =1;
        int currentEnd=farthest;   
        int i=0;
        while(currentEnd<nums.length-1)
        {
            for(int j=i+1;j<=currentEnd;j++)
            {
                if((j+nums[j])>farthest)
                {
                    farthest=j+nums[j];
                    i=j;
                }
            }
            jumps++;
            currentEnd=farthest;
        }
        return jumps;
    }
}

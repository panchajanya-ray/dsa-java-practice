// LeetCode 55. Jump Game
// Pattern: Greedy
// Time Complexity: O(n)
// Space Complexity: O(1)

package greedy;

public class JumpGame {
	public boolean canJump(int[] nums) {
        int jump=0;
        for(int num: nums)
        {
            if(jump<0) return false;
            else if(num>jump) jump=num;
            jump--;
        }
        return true;
    }
}

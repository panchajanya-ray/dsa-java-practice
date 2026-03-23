// LeetCode 41. First Missing Positive
// Pattern: Array
// Time Complexity: O(n)
// Space Complexity: O(1)

package array;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n)
        {
            if(nums[i]>0 && nums[i]<n && nums[i] != nums[nums[i]-1])
            {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
            else i++;
        }

        for(i=0;i<n;i++)
        {
            if(i!=nums[i]-1) return i+1;
        }
        return n+1;
    }
}

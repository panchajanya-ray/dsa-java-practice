// LeetCode 238. Product of Array Except Self
// Pattern: Prefix and Suffix Sum
// Time Complexity: O(n)
// Space Complexity: O(1)

package prefixSum;

public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] output = new int[n];
        int prod=1;
        for(int i=0;i<n;i++)
        {
            output[i]=prod;
            prod *= nums[i];
        }

        prod=1;
        for(int i=n-1;i>=0;i--)
        {
            output[i] *= prod;
            prod*=nums[i];
        }

        return output;
    }
}

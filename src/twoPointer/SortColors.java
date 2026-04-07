// LeetCode Problem: 75. Sort Colors
// Pattern: Three Pointer, Dutch National Flag
// Time Complexity: O(n)
// Space Complexity: O(1)

package twoPointer;

public class SortColors {
	public void swap(int [] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int i=0;
        while(i<=high)
        {
            if(nums[i]==0)
            {
                swap(nums,low,i);
                low++;
                i++;
            }
            else if(nums[i]==1) i++;
            else
            {
                swap(nums,i,high);
                high--;
            }
        }
        
        /*
        int sort[] = new int[3];
        for(int i=0;i<nums.length;i++) sort[nums[i]]++;
        int i=0;
        for (int color = 0; color < 3; color++) 
        {
            while (sort[color] > 0) 
            {
                nums[i++] = color;
                sort[color]--;
            }
        }
        */
    }
}

// LeetCode 448. Find All Numbers Disappeared in an Array
// Pattern: Array / HashMap
// Time Complexity: O(n)
// Space Complexity: O(1)

package array;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
	public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();  
        for(int i=0;i<nums.length;i++) 
        {
            int index = Math.abs(nums[i])-1;
            if(!(nums[index] < 0)) nums[index] *= -1;
        }
        for(int i=0;i<nums.length;i++) if(nums[i]>0) l.add(i+1);
        return l;
	}
}

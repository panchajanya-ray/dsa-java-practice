// LeetCode 11. Container With Most Water
// Pattern: Two Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)

package twoPointer;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
        int start =0, area;
        int end = height.length-1;
        int water=0;
        while(start<end)
        {
            if(height[start]<height[end]) 
            {
                area=height[start]*(end-start);
                start++;
            }
            else
            {
                area=height[end]*(end-start);
                end--;
            }
            if(water<area) water=area;
        }
        return water;
    }
}

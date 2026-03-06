// LeetCode 42. Trapping Rain Water
// Pattern: Two Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)

package twoPointer;

public class TrappingRainWater {
	public int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        int water = 0;

        while (left < right) {

            if (height[left] < height[right]) {

                if (height[left] >= leftMax)
                    leftMax = height[left];
                else
                    water += leftMax - height[left];

                left++;

            } else {

                if (height[right] >= rightMax)
                    rightMax = height[right];
                else
                    water += rightMax - height[right];

                right--;
            }
        }
        return water;
    }
}

// LeetCode Problem: 605. Can Place Flowers
// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

package array;

public class CanPlaceFlowers {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        int len = flowerbed.length;
        while(i < len && n > 0)
        {
            if(flowerbed[i] == 1) i += 2;
            else
            {
                if(i+1 < len && flowerbed[i+1] == 1) i += 3;
                else
                {
                    i += 2;
                    n--;
                }
            }
        }

        return n == 0;
    }
}

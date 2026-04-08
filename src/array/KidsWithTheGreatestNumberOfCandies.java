// LeetCode Problem: 1431. Kids With the Greatest Number of Candies
// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(n)

package array;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = candies[0];
        for(int i=1;i<candies.length;i++) if(maxCandy < candies[i]) maxCandy = candies[i];

        List<Boolean> result = new ArrayList<>(candies.length);

        for(int candy: candies) result.add(candy+extraCandies >= maxCandy);

        return result;
    }
}

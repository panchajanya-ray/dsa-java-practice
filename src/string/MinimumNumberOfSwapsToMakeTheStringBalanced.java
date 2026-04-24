// LeetCode 1963. Minimum Number of Swaps to Make the String Balanced
// Pattern: string
// Time Complexity: O(n)
// Space Complexity: O(1)

package string;

public class MinimumNumberOfSwapsToMakeTheStringBalanced {
	public int minSwaps(String s) {
        int stackSize = 0;
        for (char ch : s.toCharArray()) 
        {
            if (ch == '[') stackSize++;
            else if (stackSize > 0) stackSize--;
        }
        return (stackSize + 1) / 2;
    }
}

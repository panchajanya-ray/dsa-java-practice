// LeetCode 78. Subsets
// Pattern: Backtracking
// Time Complexity: O(N * 2^N)
// Space Complexity: O(N * 2^N)

package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    public void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums, int start) {
        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) 
        {
            current.add(nums[i]);
            backtrack(result, current, nums, i + 1);
            current.remove(current.size() - 1);
        }
    }
}

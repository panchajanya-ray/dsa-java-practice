// LeetCode 39. Combination Sum
// Pattern: Backtracking
// Time Complexity: O(N^((T/M)+1)), N = candidates count, T = target, M = min value
// Space Complexity: O(T/M), Maximum depth of the recursion call stack

package backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(candidates, new ArrayList<>(), 0, target);
        return ans;
    }

    public void solve(int[] input, List<Integer> output, int i, int target)
    {
        if(target == 0)
        {
            ans.add(new ArrayList<>(output));
            return;
        }

        if(i == input.length || target < 0) return;

        if(input[i] <= target)
        {
            output.add(input[i]);
            solve(input, output, i, target - input[i]);
            output.remove(output.size() - 1);
        }

        solve(input, output, i + 1, target);
    }
}

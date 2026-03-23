// LeetCode 229. Majority Element II
// Pattern: Boyer-Moore Voting Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)

package hashing;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
	public List<Integer> majorityElement(int[] nums) {
        Integer cand1 = null, cand2 = null;
        int cnt1 = 0, cnt2 = 0;

        for (int n : nums) 
        {
            if (cand1 != null && n == cand1) 
            {
                cnt1++;
            } 
            else if (cand2 != null && n == cand2) 
            {
                cnt2++;
            } 
            else if (cnt1 == 0) 
            {
                cand1 = n;
                cnt1 = 1;
            } 
            else if (cnt2 == 0) 
            {
                cand2 = n;
                cnt2 = 1;
            } 
            else 
            {
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> result = new ArrayList<>();
        int limit = nums.length / 3;
        cnt1 = 0; cnt2 = 0;

        for (int n : nums) 
        {
            if (cand1 != null && n == cand1) cnt1++;
            if (cand2 != null && n == cand2) cnt2++;
        }

        if (cnt1 > limit) result.add(cand1);
        if (cnt2 > limit) result.add(cand2);

        return result;
    }
}

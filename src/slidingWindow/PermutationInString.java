// LeetCode 567. Permutation in String I
// Pattern: Sliding Window + Frequency Array
// Time Complexity: O(n)
// Space Complexity: O(1)

package slidingWindow;

import java.util.Arrays;

public class PermutationInString {
	public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        
        int[] count1 = new int[26];
        int[] window = new int[26];

        for(char ch: s1.toCharArray()) count1[ ch - 'a'] += 1;
        int k = s1.length();
        for(int i =0;i<k;i++) window[ s2.charAt(i) - 'a'] +=1;
        
        if(Arrays.equals(count1, window)) return true;
        
        for(int i=k;i<s2.length();i++)
        {
            window[s2.charAt(i-k) - 'a'] -= 1;
            window[s2.charAt(i) - 'a'] += 1;
            if(Arrays.equals(count1, window)) return true;
        }
        return false;
    }
}

// LeetCode 438. Find All Anagrams in a String
// Pattern: Sliding Window + Frequency Array
// Time Complexity: O(n)
// Space Complexity: O(1)   (excluding output list)
// Space Complexity: O(k), k = number of anagram indices. (including output list)

package slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
	public List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length()) return new ArrayList<>();

        int[] count1 = new int[26];
        int[] window = new int[26];
        List<Integer> index = new ArrayList<>();

        for(char ch: p.toCharArray()) count1[ ch - 'a'] += 1;
        int k = p.length();
        for(int i =0;i<k;i++) window[ s.charAt(i) - 'a'] +=1;
        
        if(Arrays.equals(count1, window)) index.add(0);
        
        for(int i=k;i<s.length();i++)
        {
            window[s.charAt(i-k) - 'a'] -= 1;
            window[s.charAt(i) - 'a'] += 1;
            if(Arrays.equals(count1, window)) index.add(i-k+1);
        }
        return index;
    }
}

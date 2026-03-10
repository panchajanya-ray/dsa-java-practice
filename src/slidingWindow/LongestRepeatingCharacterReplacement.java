// LeetCode 424. Longest Repeating Character Replacement
// Pattern: Sliding Window, Character frequency, Window shrink
// Time Complexity: O(n)
// Space Complexity: O(1)

package slidingWindow;

public class LongestRepeatingCharacterReplacement {
	public int characterReplacement(String s, int k) {
        int left =0;
        int right = 0;
        int [] freq = new int[26];

        int maxFreq=0;
        int maxLength=0;
        while(right<s.length())
        {
            char c = s.charAt(right);
            freq[c - 'A']++;

            maxFreq = Math.max(maxFreq, freq[c - 'A']);

            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}

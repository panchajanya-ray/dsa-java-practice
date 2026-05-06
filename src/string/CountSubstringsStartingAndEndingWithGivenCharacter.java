// LeetCode 3084. Count Substrings Starting and Ending with Given Character
// Pattern: string
// Time Complexity: O(n), n = length of the string
// Space Complexity: O(1)

package string;

public class CountSubstringsStartingAndEndingWithGivenCharacter {
	public long countSubstrings(String s, char c) {
        long countChar = 0;
        long countSubstring = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == c)
            {
                countChar++;
                countSubstring += countChar;
            }
        }

        return countSubstring;
    }
}

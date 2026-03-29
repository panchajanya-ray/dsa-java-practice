// LeetCode 2351. First Letter to Appear Twice
// Pattern: String
// Time Complexity: O(n)
// Space Complexity: O(1)

package string;

public class FirstLetterToAppearTwice {
	public char repeatedCharacter(String s) {
        int cnt[] = new int[26];
        for(char ch: s.toCharArray())
        {
            if(cnt[ch - 'a']!=0) return ch;
            cnt[ch - 'a'] += 1;
        }

        return ' ';
    }
}

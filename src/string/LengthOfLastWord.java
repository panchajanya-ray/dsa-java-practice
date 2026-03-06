// LeetCode 58. Length of Last Word
// Pattern: String
// Time Complexity: O(n)
// Space Complexity: O(1)

package string;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
        int last = s.length()-1;
        int count=0;
        while(!Character.isLetter(s.charAt(last))) last--;
        while((s.charAt(last)!=' ') && (last>=1))
        {
            count++;
            last--;
        }
        if(s.charAt(last)==' ') return count;
        else return count+1;
    }
}

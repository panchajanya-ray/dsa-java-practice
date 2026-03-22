// LeetCode 796. Rotate String
// Pattern: String Rotation
// Time Complexity: O(n)
// Space Complexity: O(n)

package string;

public class RotateString {
	public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        s = s+s;
        return s.contains(goal);
    }
}

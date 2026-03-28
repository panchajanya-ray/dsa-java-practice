// LeetCode 1047. Remove All Adjacent Duplicates In String
// Pattern: String
// Time Complexity: O(n)
// Space Complexity: O(n)

package string;

public class RemoveAllAdjacentDuplicatesInString {
	public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            int size = sb.length();

            if (size > 0 && sb.charAt(size - 1) == c) sb.deleteCharAt(size - 1);  
            else sb.append(c);
        }

        return sb.toString();
    }
}

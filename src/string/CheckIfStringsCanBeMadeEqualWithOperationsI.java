// LeetCode 2839. Check if Strings Can be Made Equal With Operations I
// Pattern: string
// Time Complexity: O(1)
// Space Complexity: O(1)

package string;

public class CheckIfStringsCanBeMadeEqualWithOperationsI {
	public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        boolean evenMatch = ((s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2)) ||
                        (s1.charAt(0) == s2.charAt(2) && s1.charAt(2) == s2.charAt(0)));
                        
        boolean oddMatch  = ((s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3)) ||
                        (s1.charAt(1) == s2.charAt(3) && s1.charAt(3) == s2.charAt(1)));

    return evenMatch && oddMatch;
    }
}

// LeetCode Problem: 125. Valid Palindrome
// Pattern: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

package twoPointer;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
	    int start = 0;
	    int end = s.length() - 1;

	    while (start < end) {
	        while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
	            start++;
	        }

	        while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
	            end--;
	        }

	        if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
	            return false;
	        }

	        start++;
	        end--;
	    }

	    return true;
	}
}

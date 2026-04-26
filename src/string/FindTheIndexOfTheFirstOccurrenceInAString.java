// LeetCode 28. Find the Index of the First Occurrence in a String
// Pattern: string
// Time Complexity: O(N * M), N & M = length of haystack & needle respectively
// Space Complexity: O(1)

package string;

public class FindTheIndexOfTheFirstOccurrenceInAString {
	public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

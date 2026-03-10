// LeetCode 744. Find Smallest Letter Greater Than Target
// Pattern: Binary Search
// Time Complexity: O(log n) average, O(n) worst case
// Space Complexity: O(1)

package binarySearch;

public class FindSmallestLetterGreaterThanTarget {
	public char nextGreatestLetter(char[] letters, char target) {
        int left=0;
        int right=letters.length-1;
        int mid=0;
        while(left<=right)
        {
            mid = (left+right)/2;
            if(letters[mid]==target) break;
            else if(letters[mid]>target) right=mid-1;
            else left=mid+1;
        }
        if(letters[mid]==target)
        {
            while(mid<letters.length && letters[mid]==target) mid++;
            if(mid==letters.length) return letters[0];
            else return letters[mid];
        }
        else if(left == letters.length) return letters[0];
        else return letters[left];
    }
}

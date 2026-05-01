// LeetCode 374. Guess Number Higher or Lower
// Pattern: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

package binarySearch;

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */


public class GuessNumberHigherOrLower {
	public int guessNumber(int n) {
        int left = 0;
        int right = n;
        while(left <= right)
        {
            int mid = left + (right - left)/2;
            if(guess(mid) == 0) return mid;
            else if(guess(mid) == 1) left = mid + 1;
            else right = mid - 1;
        }

        return 0;
    }

// leetcode Predefined method
	private int guess(int mid) {
		// TODO Auto-generated method stub
		return 0;
	}
}

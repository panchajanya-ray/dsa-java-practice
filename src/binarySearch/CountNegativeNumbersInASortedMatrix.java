// LeetCode 1351. Count Negative Numbers in a Sorted Matrix
// Pattern: Binary Search
// Time Complexity: O(M log N), M = no. of rows, N = no. of columns
// Space Complexity: O(1)

package binarySearch;

public class CountNegativeNumbersInASortedMatrix {
	public int countNegatives(int[][] grid) {
        int ans = 0;
        for(int[] row: grid)
        {
            ans += row.length - getFirstNegativeIndex(row);
        }
        return ans;
    }

    public int getFirstNegativeIndex(int[] row)
    {
        int firstNegative = row.length;
        int left = 0;
        int right = row.length-1;
        
        while(left<=right)
        {
            int mid = left + (right - left)/2;
            
            if(row[mid] < 0)
            {
                firstNegative = mid;
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return firstNegative;
    }
}

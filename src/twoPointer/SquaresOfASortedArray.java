// LeetCode Problem: 977. Squares of a Sorted Array
// Pattern: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(n)

package twoPointer;

public class SquaresOfASortedArray {
	public int[] sortedSquares(int[] nums) {
	    int res[]= new int[nums.length];
	    int start=0;
	    int end=nums.length-1;
	    int i= res.length-1;
	    while(start<=end)
	    {
	        int leftSq=nums[start]*nums[start];
	        int rightSq=nums[end]*nums[end];
	        if(leftSq<=rightSq)
	        {
	            res[i--]=rightSq;
	            end--;
	        }
	        else
	        {
	            res[i--]=leftSq;
	            start++;
	        }
	    }
	    return res;
	    }   
}


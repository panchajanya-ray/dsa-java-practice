// LeetCode Problem: 754. Reach a Number
// Pattern: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

package binarySearch;

public class ReachANumber {
	public int reachNumber(int target) {
        target = Math.abs(target);

        int start = 1;
        int end = target;
        int cnt = 0;
        long finalPos = 0;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            long sum = (long)mid*(mid+1)/2;

            if(sum>=target)
            {
                finalPos = sum;
                cnt = mid;
                end = mid-1;
            }
            else start = mid+1;
        }

    
        while ((finalPos - target) % 2 != 0) 
        {
            cnt++;
            finalPos += cnt;
        }

        return cnt;

        /*target = Math.abs(target);
        int cnt = 0;
        int sum = 0;
        while(sum < target)
        {
            cnt++;
            sum += cnt;
        }

        while((sum - target) % 2 != 0)
        {
            cnt++;
            sum += cnt;
        }
        return cnt;
        */
    }
}

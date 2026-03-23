// LeetCode 881. Boats to Save People
// Pattern: Number manipulation
// Time Complexity: O(n + limit)
// Space Complexity: O(limit)

package twoPointer;

public class BoatsToSavePeople {
	public int numRescueBoats(int[] people, int limit) {
        //Counting Sort
        int[] count = new int[limit + 1];
        for (int p : people) {
            count[p]++;
        }
        int left=0;
        for (int i = 0; i < people.length; i++) 
        {
            while (count[left] == 0) left++;
            people[i] = left;
            count[left]--;
        }
        
        left=0;
        int right=people.length-1;
        int cnt=0;
        while(left<=right)
        {
            cnt++;
            int sum=people[left]+people[right];
            if(sum<=limit) left++;
            right--;
        }
        return cnt;
    }
}

// LeetCode Problem: 763. Partition Labels
// Pattern: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

package twoPointer;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
	public List<Integer> partitionLabels(String s) {
        int[] lastIndex = new int[26] ;
        List<Integer> result = new ArrayList<>();
        
        int n = s.length();
        for(int i=0; i<n; i++) lastIndex[s.charAt(i)-'a']  = i;

        int pStart = 0;
        int pEnd = 0;
        for(int i=0;i<n;i++)
        {
            pEnd = Math.max(pEnd, lastIndex[s.charAt(i) -'a']);
            if(i == pEnd) 
            {
                result.add(i-pStart+1);
                pStart = i+1;
            }
        }
        return result;
    }
}

// LeetCode Problem: 118. Pascal's Triangle
// Pattern: Dynamic programming
// Time Complexity: O(n^2)
// Space Complexity: O(n^2)

package dp;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 1)
        {
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            res.add(firstRow);
            return res;
        }

        res = generate(numRows -1);
        List<Integer> prevRow = res.get(numRows - 2);
        List<Integer> currRow = new ArrayList<>();
        currRow.add(1);

        for(int i=1;i<numRows - 1;i++)
        {
            currRow.add(prevRow.get(i-1) + prevRow.get(i));
        }

        currRow.add(1);
        res.add(currRow);

        return res;

        /*
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);
        
        if(numRows == 1) return res;

        for(int i=1;i<numRows;i++)
        {
            List<Integer> prevRow = res.get(i-1);
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for(int j = 1;j<i;j++)
            {
                currRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            currRow.add(1);
            res.add(currRow);
        }
        return res;
        */
    }
}

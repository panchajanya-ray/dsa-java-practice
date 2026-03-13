// LeetCode 134. Gas Station
// Pattern: Greedy
// Time Complexity: O(n)
// Space Complexity: O(1)

package greedy;

public class GasStation {
	public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0;
        int tank = 0;
        int start = 0;

        for(int i=0;i<gas.length;i++)
        {
            int diff = gas[i] - cost[i];
            totalCost+= diff;
            tank+= diff;

            if(tank<0)
            {
                start = i+1;
                tank=0;
            }
        }

        if(totalCost < 0) return -1;
        else return start;
    }
}

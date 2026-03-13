// LeetCode 200. Number of Islands
// Pattern: Graph
// Time Complexity: O(m × n)
// Space Complexity: O(m × n)  ( recursion stack worst case)

package graph;

public class NumberOfIslands {
	public int numIslands(char[][] grid) {

        int count = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {

                if(grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }

            }
        }

        return count;
    }

    private void dfs(char[][] grid, int i, int j) {

        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return;

        if(grid[i][j] == '0')
            return;

        grid[i][j] = '0';

        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}

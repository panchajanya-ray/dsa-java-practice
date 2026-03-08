// LeetCode 682. Baseball GameI
// Pattern: Stack
// Time Complexity: O(n)
// Space Complexity: O(n)

package stack;

import java.util.Stack;

public class BaseballGame {
	    public int calPoints(String[] operations) {
	        Stack <Integer> game = new Stack<>();
	        int score=0;
	        for(String op: operations)
	        {
	            switch(op)
	            {
	                case "C":
	                    if(!game.isEmpty()) game.pop();
	                    break;
	                case "D":
	                    if(!game.isEmpty()) game.push(game.peek()*2);
	                    break;
	                case "+":
	                    game.push(game.get(game.size()-1)+game.get(game.size()-2));
	                    break;
	                default:
	                    game.push(Integer.parseInt(op));
	                    break;
	            }
	        }
	        while(!game.isEmpty()) score+= game.pop();

	        return score;
	    }
}

// LeetCode 637. Average of Levels in Binary Tree
// Pattern: Tree
// Time Complexity: O(n)
// Space Complexity: O(n)

package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Definition for a binary tree node.
/*
class TreeNode {
int val;
TreeNode left;
TreeNode right;
TreeNode() {}
TreeNode(int val) { this.val = val; }
TreeNode(int val, TreeNode left, TreeNode right) {
this.val = val;
this.left = left;
this.right = right;
}
}
*/

public class AverageOfLevelsInBinaryTree {
	public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if(root == null) return list;
        else if(root.left == null && root.right == null)
        {
            list.add((double)root.val);
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int len = queue.size();
            double levelAvg = 0;
            for(int i=0;i<len;i++)
            {
                TreeNode node = queue.poll();
                levelAvg+= node.val;

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            list.add(levelAvg/len);
        }
        return list;
    }
}

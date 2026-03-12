// LeetCode 102. Binary Tree Level Order Traversal
// Pattern: Binary Tree
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

public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> output = new ArrayList<>();

        q.add(root);

        while (!q.isEmpty()) 
        {
            int len = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < len; i++) 
            {
                TreeNode node = q.poll();
                level.add(node.val);

                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            output.add(level);
        }
        return output;
    }
}

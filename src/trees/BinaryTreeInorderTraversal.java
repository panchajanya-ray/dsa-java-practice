// LeetCode 94. Binary Tree Inorder Traversal
// Pattern: Binary Tree
// Time Complexity: O(n)
// Space Complexity: O(n)

package trees;

import java.util.ArrayList;
import java.util.List;

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

public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }
}

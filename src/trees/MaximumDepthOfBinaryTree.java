// LeetCode 104. Maximum Depth of Binary Tree
// Pattern: Binary Tree
// Time Complexity: O(n)
// Space Complexity: O(h), h = height of tree
// Space Complexity: O(n) (Worst Case)

package trees;

// Definition for a binary tree node.
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

public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        else return (1+Math.max(maxDepth(root.left), maxDepth(root.right)));
    }
}

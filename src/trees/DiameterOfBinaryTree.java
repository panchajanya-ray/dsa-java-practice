// LeetCode 543. Diameter of Binary Tree
// Pattern: Binary Tree
// Time Complexity: O(n)
// Space Complexity: O(h), h = height of tree

package trees;

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

public class DiameterOfBinaryTree {
	int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        solve(root);
        return res;
    }

    int solve(TreeNode root)
    {
        if(root == null) return 0;

        int left = solve(root.left);
        int right = solve(root.right);

        res = Math.max(res, left + right);
        
        return Math.max(left, right) + 1;
    }
}

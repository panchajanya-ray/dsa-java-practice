// LeetCode 101. Symmetric Tree
// Pattern: Binary Tree
// Time Complexity: O(n)
// Space Complexity: O(h)   // h = height of tree
// Space Complexity: O(n), Worst Case 

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

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
        return mirror(root.left, root.right);
    }

    public boolean mirror(TreeNode left, TreeNode right)
    {
        if(left== null && right == null) return true;

        if(left== null || right == null) return false;

        if(left.val != right.val) return false;

        return mirror(left.left, right.right) && mirror(left.right, right.left);
    }
}

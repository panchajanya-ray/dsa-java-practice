// LeetCode 112. Path Sum
// Pattern: Tree
// Time Complexity: O(n)
// Space Complexity: O(h),  h = height of tree
// Space Complexity: O(n) (Worst Case)


package trees;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        targetSum = targetSum - root.val;

        if(root.left==null && root.right==null) return targetSum==0;

        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);  
    }
}

// LeetCode 144. Binary Tree Preorder Traversal
// Pattern: Trees, DFS
// Time Complexity: O(N)
// Space Complexity: O(N)

package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
	List<Integer> order = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return order;
        order.add(root.val);
        if(root.left != null) preorderTraversal(root.left);
        if(root.right != null) preorderTraversal(root.right);
        return order;
    }
}

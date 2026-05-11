// LeetCode 872. Leaf-Similar Trees
// Pattern: Binary Search
// Time Complexity: O(T1 + T2)
// Space Complexity: O(H1 + H2 + L1 + L2)

package binarySearch;

import java.util.ArrayList;
import java.util.List;


//Definition for a binary tree node.
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


public class Leaf_SimilarTrees {
	 public boolean leafSimilar(TreeNode root1, TreeNode root2) {
	        List<Integer> leafValues1 = new ArrayList<>();
	        List<Integer> leafValues2 = new ArrayList<>();
	        
	        collectLeafValues(root1, leafValues1);
	        collectLeafValues(root2, leafValues2);

	        return leafValues1.equals(leafValues2);
	    }

	    private void collectLeafValues(TreeNode root, List<Integer> leafValues) {
	        if (root == null) {
	            return;
	        }
	        if (root.left == null && root.right == null) {
	            leafValues.add(root.val);
	        }
	        collectLeafValues(root.left, leafValues);
	        collectLeafValues(root.right, leafValues);
	    }
}

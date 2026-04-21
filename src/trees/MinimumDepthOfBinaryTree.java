// LeetCode 111. Minimum Depth of Binary Tree
// Pattern: Binary Tree
// Time Complexity: O(N)
// Space Complexity: O(W), W = width of the tree

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

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {
	/*
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        
        int left = minDepth(root.left);
        int right =minDepth(root.right);

        if (left==0 || right==0) return Math.max(left,right)+1;
        
        return Math.min(left,right)+1;
    }
    */

    public int minDepth(TreeNode root){
        if(root==null) return 0;
        Queue<TreeNode> que = new LinkedList<>();

        que.add(root);
        int depth = 1;
        while(!que.isEmpty())
        {
            int size = que.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node = que.poll();
                if(node.left==null && node.right==null) return depth;
                if(node.left!=null) que.add(node.left);
                if(node.right!=null) que.add(node.right);
            }
            depth++;
        }
        return depth;
    }
}

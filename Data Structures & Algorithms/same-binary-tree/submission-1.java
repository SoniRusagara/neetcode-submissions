/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base Case 1: if both are null then they are the same
        if (p == null && q == null) { 
            return true; 
        }

        // Base Case 2: if only one is null then they arent the same
        if(p == null || q == null) {
            return false; 
        }

        // Base Case 3: if the values arent the same
        if(p.val != q.val) {
            return false; 
        }

        // Recur Case 
        boolean leftSubTree = isSameTree(p.left, q.left);
        boolean rightSubTree = isSameTree(p.right, q.right);

        return leftSubTree && rightSubTree;
        
    }
}

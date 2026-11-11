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
        // Base Case: if both are null 
        if(p == null && q == null){ return true; }

        // Base Case 2: if only one is null 
        if(p == null || q == null){ return false; }

        // Base Case 3: if values are not equal 
        if(p.val != q.val ){ return false; }

        // Recur Case
        boolean leftSame = isSameTree(p.left, q.left);
        boolean rightSame = isSameTree(p.right, q.right);
        
        // Return boolean 
        return leftSame && rightSame;
        
    }
}

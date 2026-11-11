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
        // Base 1: if both nodes are null 
        if(p == null && q == null){
            return true;
        }

        // Base 2: if only one node is null 
        if(p == null || q == null){
            return false;
        }

        // Base 3: if values of nodes are not the same 
        if(p.val != q.val){
            return false;
        }

        // Recur Case 
        boolean leftSame = isSameTree(p.left, q.left);
        boolean rightSame = isSameTree(p.right, q.right);

        return leftSame && rightSame; 
        
    }
}

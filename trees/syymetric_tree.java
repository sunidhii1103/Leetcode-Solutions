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
    public boolean isSymmetric(TreeNode root) {
        return root==null || SymmetricHelp(root.left,root.right);
    }
    private boolean SymmetricHelp(TreeNode left, TreeNode right){
        if(left==null||right==null) return left==right;
        if(left.val!=right.val)
        return false;
        return SymmetricHelp(left.left,right.right)&& SymmetricHelp(left.right,right.left);
    }
}
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        // Push the root into the first stack
        s1.push(root);
        while (!s1.isEmpty()) {
            // Remove a node from the first stack
            TreeNode curr = s1.pop();
            // Push it into the second stack
            s2.push(curr);
            // Push left child first
            if (curr.left != null) {
                s1.push(curr.left);
            }
            // Push right child
            if (curr.right != null) {
                s1.push(curr.right);
            }
        }
        // The second stack now contains nodes
        // in reverse postorder, so popping gives postorder
        while (!s2.isEmpty()) {
            ans.add(s2.pop().val);
        }
        return ans;
    }
}
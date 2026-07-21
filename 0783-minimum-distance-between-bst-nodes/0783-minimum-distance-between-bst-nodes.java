class Solution {
    TreeNode prev = null;
    public int minDiffInBST(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int ans = Integer.MAX_VALUE;
        if (root.left != null) {
            ans = Math.min(ans, minDiffInBST(root.left));
        }
        if (prev != null) {
            ans = Math.min(ans, root.val - prev.val);
        }
        prev = root;
        if (root.right != null) {
            ans = Math.min(ans, minDiffInBST(root.right));
        }
        return ans;
    }
}
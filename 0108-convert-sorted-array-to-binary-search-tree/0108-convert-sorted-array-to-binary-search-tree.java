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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
        return null;
        return getBST(nums,0,nums.length-1);
    }

    public TreeNode getBST(int[] nums, int startidx, int endidx){
        if(startidx>endidx)
        return null;

        int middleidx=(startidx+endidx)/2;
        TreeNode bst=new TreeNode(nums[middleidx]);
        bst.left=getBST(nums,startidx,middleidx-1);
        bst.right=getBST(nums,middleidx+1,endidx);

        return bst;
    }
}
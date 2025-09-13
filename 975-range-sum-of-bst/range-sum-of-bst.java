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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        int right=0;
        int left=0;
        int value=0;
        if(root.val<low) right=rangeSumBST(root.right,low,high);
        else if(root.val>high) left=rangeSumBST(root.left,low,high);
        else{
            value=root.val;
            right=rangeSumBST(root.right,low,high);
            left=rangeSumBST(root.left,low,high);
        }
        return left+right+value;
    }
}
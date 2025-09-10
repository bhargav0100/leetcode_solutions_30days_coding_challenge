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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>elements=new ArrayList();
        preorder(root,elements);
        return elements;
    }
    private void preorder(TreeNode root,List<Integer>elements)
    {
        if(root==null)return;
        elements.add(root.val);
        preorder(root.left,elements);
        preorder(root.right,elements);
    }
}
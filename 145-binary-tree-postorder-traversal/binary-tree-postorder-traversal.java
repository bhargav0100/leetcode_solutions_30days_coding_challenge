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
        List<Integer>elements=new ArrayList();
        postorder(root,elements);
        return elements;
    }
    private void postorder(TreeNode root,List<Integer>elements)
    {
        if(root==null) return;
        postorder(root.left,elements);
        postorder(root.right,elements);
        elements.add(root.val);
    }
}
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
    public int sumOfLeftLeaves(TreeNode root) {
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        int sum=0;
        while(!q.isEmpty())
        {
            int length=q.size();
            while(length>0)
            {
                TreeNode node=q.poll();
                if(node.left!=null)
                {
                    if(node.left.left==null && node.left.right==null) sum+=node.left.val;
                    q.add(node.left);
                }
                if(node.right!=null) q.add(node.right);
                length--;
            }
        }
        return sum;
    }
}
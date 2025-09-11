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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        ArrayDeque<TreeNode>aq=new ArrayDeque();
        aq.add(root);
        int depth=0;
        while(!aq.isEmpty())
        {
            int height=aq.size();
            while(height>0)
            {
                TreeNode node=aq.poll();
                if(node.left!=null) aq.add(node.left);
                if(node.right!=null) aq.add(node.right);
                height--;
            }
            depth++;
        }
        return depth;
    }
}
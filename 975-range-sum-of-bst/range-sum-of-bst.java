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
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        int sum=0;
        while(!q.isEmpty())
        {
            int length=q.size();
            while(length>0)
            {
                TreeNode node=q.poll();
                int num=node.val;
                if(num>=low && num<=high) sum+=num;
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                length--;
            }
        }
        return sum;
    }
}
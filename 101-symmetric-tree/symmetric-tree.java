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
        Queue<TreeNode> node=new LinkedList();
        
        if(root.left!=null) node.add(root.left);
        if(root.right!=null) node.add(root.right);
        while(!node.isEmpty())
        {
            int length=node.size();
            if(length%2!=0) return false;
            while(length>0)
            {
                TreeNode temp1=node.poll();
                TreeNode temp2=node.poll();
                if(temp1.val!=temp2.val) return false;
                if(temp1.left!=null) node.add(temp1.left);
                if(temp2.right!=null) node.add(temp2.right);
                int len=node.size();
                if((length-len)%2!=0) return false;
                if(temp1.right!=null) node.add(temp1.right);
                if(temp2.left!=null) node.add(temp2.left);
                len=node.size();
                if((length-len)%2!=0) return false;
                length-=2;
            }
        }
        return true;
    }
}
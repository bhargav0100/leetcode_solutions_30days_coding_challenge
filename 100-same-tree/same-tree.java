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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        Queue<TreeNode> node1=new LinkedList();
        Queue<TreeNode> node2=new LinkedList();
        node1.add(p);
        node2.add(q);
        while(!node1.isEmpty() && !node2.isEmpty())
        {
            int len1=node1.size();
            int len2=node2.size();
            if(len1!=len2) return false;
            while(len1>0 && len2>0)
            {
                TreeNode t1=node1.poll();
                TreeNode t2=node2.poll();
                if(!same(t1,t2)) return false;
                if(t1.left!=null) node1.add(t1.left);
                if(t2.left!=null) node2.add(t2.left);
                if(node1.size()!=node2.size()) return false;
                if(t1.right!=null) node1.add(t1.right);
                if(t2.right!=null) node2.add(t2.right);
                if(node1.size()!=node2.size()) return false;
                len1--;
                len2--;
            }
        }
        return true;
    }
    private boolean same(TreeNode p,TreeNode q)
    {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val==q.val) return true;
        return false;
    }
}
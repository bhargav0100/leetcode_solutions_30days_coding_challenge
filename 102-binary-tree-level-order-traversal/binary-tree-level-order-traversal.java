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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList();
        List<List<Integer>>elements=new ArrayList();
        Queue<TreeNode>q=new ArrayDeque();
        q.add(root);
        level(elements,q);
        return elements;
    }
    private void level(List<List<Integer>> elements,Queue<TreeNode> q)
    {
        int length=q.size();
        if(length==0) return;
        List<Integer> list=new ArrayList();
        while(length>0)
        {
            TreeNode root=q.poll();
            if(root==null) continue;
            list.add(root.val);
            if(root.left!=null) q.add(root.left);
            if(root.right!=null) q.add(root.right);
            length--;
        }
        elements.add(list);
        level(elements,q);
    }
}
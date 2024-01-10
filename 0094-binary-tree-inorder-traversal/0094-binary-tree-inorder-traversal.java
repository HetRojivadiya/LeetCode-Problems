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
    
    static List<Integer> l=new ArrayList<>();
    
    public void method(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        method(root.left);
        l.add(root.val);
        method(root.right);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        l.clear();
        method(root);
        return l;
       
        
    }
}
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
    
    List<Integer> l=new ArrayList<>();
    
    public void method(TreeNode root) {
        if (root == null) {
            return;
        }
        l.add(root.val);
        method(root.left); 
        method(root.right); 
        
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        l.clear();
        method(root);
        return l;
    }
}
import java.util.Stack;

class Solution {
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int maxDepth = 0;
    Stack<TreeNode> stack = new Stack<>();
    Stack<Integer> value = new Stack<>(); // Specify type for value stack
    stack.push(root);
    value.push(1); // Push depth of root node
    
    while (!stack.isEmpty()) { // Fix condition
      TreeNode node = stack.pop();
      int depth = value.pop(); // Retrieve depth of current node
      maxDepth = Math.max(depth, maxDepth); // Update maxDepth
      
      if (node.left != null) {
        stack.push(node.left);
        value.push(depth + 1); // Push depth of left child
      }
      
      if (node.right != null) {
        stack.push(node.right);
        value.push(depth + 1); // Push depth of right child
      }
    }
    
    return maxDepth;
  }
}

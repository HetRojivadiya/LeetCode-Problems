import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        if (root == null || k <= 0) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        Map<Integer, Long> levelSums = new HashMap<>();

        int level = 0;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            long sum = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                sum += current.val;

                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            levelSums.put(level, sum);
            level++;
        }

        List<Long> sums = new ArrayList<>(levelSums.values());
        Collections.sort(sums, Collections.reverseOrder());

        if (k > sums.size()) {
            return -1; // Return -1 if k exceeds available sums
        }

        return sums.get(k - 1);
    }
}

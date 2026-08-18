import java.util.*;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Deque<TreeNode> dq = new ArrayDeque<>();
        dq.addLast(root);

        boolean lr = true;

        while (!dq.isEmpty()) {
            int n = dq.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (lr) {
                    TreeNode node = dq.removeFirst();
                    level.add(node.val);

                    if (node.left != null)
                        dq.addLast(node.left);

                    if (node.right != null)
                        dq.addLast(node.right);
                } else {
                    TreeNode node = dq.removeLast();
                    level.add(node.val);

                    if (node.right != null)
                        dq.addFirst(node.right);

                    if (node.left != null)
                        dq.addFirst(node.left);
                }
            }
            ans.add(level);
            lr = !lr;
        }
        return ans;
    }
}
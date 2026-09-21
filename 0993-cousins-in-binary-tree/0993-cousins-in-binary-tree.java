class Solution {
    
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode parentX = findParent(root, x, null);
        TreeNode parentY = findParent(root, y, null);
        int depthX = findDepth(root, x, 0);
        int depthY = findDepth(root, y, 0);
        return depthX == depthY && parentX != parentY;
    }
    public TreeNode findParent(TreeNode root, int value, TreeNode parent) {
        if (root == null) {
            return null;
        }
        if (root.val == value) {
            return parent;
        }
        TreeNode left = findParent(root.left, value, root);
        if (left != null) {
            return left;
        }
        return findParent(root.right, value, root);
    }
    public int findDepth(TreeNode root, int value, int depth) {
    
        if (root == null) {
            return -1;
        }
        if (root.val == value) {
            return depth;
        }        
        int left = findDepth(root.left, value, depth + 1);
        if (left != -1) {
            return left;
        }
        return findDepth(root.right, value, depth + 1);
    }
}
class Solution {

    public void inorder(TreeNode root, ArrayList<Integer> a) {
        if (root==null)
            return;
        inorder(root.left,a);
        a.add(root.val);
        inorder(root.right,a);
    }
    public int kthSmallest(TreeNode root,int k) {
        ArrayList<Integer> a=new ArrayList<>();
        inorder(root,a);
        return a.get(k-1);
    }
}
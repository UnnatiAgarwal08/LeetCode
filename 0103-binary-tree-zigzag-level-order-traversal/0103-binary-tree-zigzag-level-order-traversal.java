import java.util.*;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean LeftToRight = true;

        while (!q.isEmpty()) {

            int l=q.size();
            List<Integer> temp=new ArrayList<>();

            for (int i=0;i<l;i++){
                TreeNode node=q.poll();
                if (LeftToRight)        temp.add(node.val);
                else                    temp.add(0, node.val);
                if (node.left!=null)    q.offer(node.left);
                if (node.right!=null)   q.offer(node.right);
            }
            ans.add(temp);
            LeftToRight = !LeftToRight;
        }
        return ans;
    }
}
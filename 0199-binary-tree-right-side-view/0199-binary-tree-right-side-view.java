class Solution {
    void ReversePreOrder(TreeNode root,int level,List<Integer> ans){
        if(root==null)
         return ;
        if(ans.size()==level)
           ans.add(root.val);
        ReversePreOrder(root.right,level+1,ans);
        ReversePreOrder(root.left,level+1,ans);
    } 
 public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        ReversePreOrder(root,0,result);
        return result;
    }
}
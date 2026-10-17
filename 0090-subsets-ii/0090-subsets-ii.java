class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        Arrays.sort(nums);
        findSumset(res,0,nums,cur);
        return res;
    }
    void findSumset(List<List<Integer>> res,int ind,int[] nums,List<Integer> cur){
        res.add(new ArrayList<>(cur));

        for(int i=ind;i<nums.length;i++)
        {
            if(i>ind && nums[i]==nums[i-1])
              continue;

            cur.add(nums[i]);
            findSumset(res,i+1,nums,cur);
            cur.remove(cur.size()-1);
        }
    }
}
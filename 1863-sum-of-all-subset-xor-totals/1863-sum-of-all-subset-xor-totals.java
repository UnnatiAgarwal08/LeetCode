class Solution {
    public int subsetXORSum(int[] nums) {
        return find(0,nums,0);
    }
    public int find(int index,int[] nums, int xor){
      if (index==nums.length)
            return xor;

        int include=find(index+1,nums,xor^nums[index]);
        int exclude=find(index+1,nums,xor);
        return include+exclude;
    }
}
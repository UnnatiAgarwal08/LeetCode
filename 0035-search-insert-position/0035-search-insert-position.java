class Solution {
    public int searchInsert(int[] nums, int target) {
        int n= nums.length;
        int ans=n;
        int low=0;int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]<target)
              low=mid+1;
            else
              {
                ans=mid;
                high=mid-1;
              }
        }
        return ans;
    }
}
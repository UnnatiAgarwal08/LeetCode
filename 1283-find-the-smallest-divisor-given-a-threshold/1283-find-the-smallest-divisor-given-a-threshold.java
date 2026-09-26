class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=0;
        for(int i:nums)
        {
            high=Math.max(high,i);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            
            int ans=0;
            for(int i:nums)
            {
                ans+=(i+mid-1)/mid;
            }
            if(ans<=threshold)
               high=mid-1;
            else
               low=mid+1;
        }
        return low;
    }
}
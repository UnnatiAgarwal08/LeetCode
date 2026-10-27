class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            int j=0;
            while(j<m){
               if(nums1[i]==nums2[j] && !ans.contains(nums1[i])){
                  ans.add(nums1[i]);
                    break;
               }
                j++;
            }
        }
        int result[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            result[i]=ans.get(i);
        }
        return result;
    }
}
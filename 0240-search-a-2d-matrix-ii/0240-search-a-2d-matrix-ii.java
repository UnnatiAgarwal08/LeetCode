class Solution {
    public int binary(int[] mat, int x)
    {
        int n=mat.length;
        int low=0;int high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(mat[mid]==x)
              return 1;
            else if(mat[mid]<x)
               low=mid+1;
            else
               high=mid-1;
        }
        return -1;
    }
    public boolean searchMatrix(int[][] mat, int target) {
        int n=mat.length;
        int m=mat[0].length;
        if(n==0||m==0)
          return false;
        for(int i=0;i<n;i++)
        {
            int ind=binary(mat[i],target);
            if(ind==1)
              return true;
        }
        return false;
    }
}
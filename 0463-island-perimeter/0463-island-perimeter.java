class Solution {
    public int islandPerimeter(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {   int p=0;
                if(grid[i][j]==1)
                {
                    if(i==n-1 || grid[i+1][j]==0) p++;
                    if(i==0 || grid[i-1][j]==0) p++;
                    if(j==0 || grid[i][j-1]==0) p++;
                    if(j==m-1 || grid[i][j+1]==0) p++;
                }
                ans=ans+p;
            }
        }
        return ans;
    }
}
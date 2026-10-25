class Solution {
    int n,m;
    void dfs(int[][]grid,int r,int c){
        if(r<0 || r>=n || c<0||c>=m ||grid[r][c]==1)
           return;

        grid[r][c]=1;
        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }
    public int closedIsland(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        for(int i=0;i<n;i++)
        {
            dfs(grid,i,0);
            dfs(grid,i,m-1);
        }
        for(int i=0;i<m;i++)
        {
            dfs(grid,0,i);
            dfs(grid,n-1,i);
        }
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(grid[i][j]==0)
                {
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int ans[][]= new int [n][m];
        Queue<int[]> q=new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                  q.add(new int[]{i,j});
                else
                  ans[i][j]=-1;
            }
        }
        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        while(!q.isEmpty())
        {
            int[] p=q.poll();
            for(int k=0;k<4;k++)
            {
                int x=p[0]+dx[k];
                int y=p[1]+dy[k];
                if(x>=0 && y>=0 && x<n && y<m && ans[x][y]==-1)
                {
                    ans[x][y]=ans[p[0]][p[1]]+1;
                    q.add(new int[]{x,y});
                }
            }
        }
        return ans;
    }
}
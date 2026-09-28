//dfs approach

class Solution {
    void dfs(int city, int[][] isConnected, boolean[] visited){
        visited[city]=true;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[city][j]==1 && visited[j]==false)
            {
                dfs(j,isConnected,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int provinces=0;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==false)
            {
                provinces++;
                dfs(i,isConnected,visited);
            }
        }
        return provinces;
    }
}
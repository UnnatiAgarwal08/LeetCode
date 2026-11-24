class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        int vis[]=new int[n];
        int pathVis[]=new int[n];
        int safe[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(vis[i]==0)
               dfs(i,graph,vis,pathVis,safe);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(safe[i]==1)
               ans.add(i);
        }
        return ans;
    }
    boolean dfs(int node,int[][] graph,int[] vis,int[] pathVis,int[] safe){
        vis[node]=1;
        pathVis[node]=1;
        for(int adj:graph[node])
        {
            if(vis[adj]==0)
            {
                if(dfs(adj,graph,vis,pathVis,safe))
                   return true;
            }
            else if(pathVis[adj]==1)
               return true;
        }
        pathVis[node]=0;
        safe[node]=1;
        return false;
    }
}
class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] visited=new int[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(visited[i]==0)
            {
                if(bipartite(graph,i,visited,1)==false) return false;
            }
        }
        return true;
    }
    private boolean bipartite(int[][] graph,int node,int[] visited,int mark)
    {
        visited[node]=mark;
        for(int n:graph[node])
        {
            if(visited[n]==mark) return false;
            if(visited[n]==0)
            {
                if(mark==1)
                {
                    visited[n]=2;
                    if(bipartite(graph,n,visited,2)==false) return false;
                }
                else {
                    visited[n]=1;
                    if(bipartite(graph,n,visited,1)==false) return false;
                }
            }
            
        }
        return true;
    }
}
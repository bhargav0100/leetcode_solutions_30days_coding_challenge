class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<List<Integer>>> pair=new ArrayList();
        int[] min=new int[n];
        for(int i=0;i<min.length;i++)
        {
            pair.add(new ArrayList());
            min[i]=Integer.MAX_VALUE;
        }
        for(int[] flight:flights)
        {
            int i=flight[0];
            
            pair.get(i).add(Arrays.asList(flight[1],flight[2]));
            
        }
        Queue<List<Integer>> q=new LinkedList();
        q.add(Arrays.asList(0,src,0));
        while(!q.isEmpty())
        {
            int stops=q.peek().get(0);
            if(stops>k) break;
            int node=q.peek().get(1);
            int cost=q.peek().get(2);
            q.remove();
            if(cost>=min[dst]) continue;
            List<List<Integer>> temp=pair.get(node);
            for(List<Integer> t:temp)
            {
                int tnode=t.get(0);
                int tcost=t.get(1);
                if(min[tnode]>cost+tcost)
                {
                    min[tnode]=Math.min(min[tnode],cost+tcost);
                }
                else
                {
                    continue;
                }
                if(min[dst]<=cost+tcost) continue;
                if(tnode==dst || pair.get(tnode)==null) continue;
                q.add(Arrays.asList(stops+1,tnode,tcost+cost));
            }
        }
        if(min[dst]==Integer.MAX_VALUE) return -1;
        return min[dst];
    }
}
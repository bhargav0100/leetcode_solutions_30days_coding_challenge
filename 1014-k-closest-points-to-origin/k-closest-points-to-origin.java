class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]>q=new PriorityQueue(new Comparator<int[]>(){
            public int compare(int[]p1,int[]p2)
            {
                return ((p2[0]*p2[0]+p2[1]*p2[1])-(p1[0]*p1[0]+p1[1]*p1[1]));
            }
        });
        for(int[] p:points)
        {
            q.add(p);
            if(q.size()>k)
            {
                q.poll();
            }
        }
        int[][]ans=new int[k][2];
        int i=0;
        while(!q.isEmpty())
        {
            ans[i++]=q.poll();
        }
        return ans;
    }
}
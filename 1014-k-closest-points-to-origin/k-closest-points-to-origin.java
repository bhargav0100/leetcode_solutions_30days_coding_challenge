class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points,(p1,p2)->((p2[0]*p2[0]+p2[1]*p2[1])-(p1[0]*p1[0]+p1[1]*p1[1])));
        int[][]ans=new int[k][2];
        int j=points.length-1;
        for(int i=0;i<k;i++)
        {
            ans[i]=points[j--];
        }
        return ans;
    }
}
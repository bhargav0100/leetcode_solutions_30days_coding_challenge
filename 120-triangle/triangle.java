class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int height=triangle.size();
        int[][] t=new int[height+1][height+1];
        for(int i=height-1;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                t[i][j]=triangle.get(i).get(j)+Math.min(t[i+1][j],t[i+1][j+1]);
            }
        }
        return t[0][0];
    }
}
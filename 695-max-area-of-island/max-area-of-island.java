class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxIsland=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                {
                    maxIsland=Math.max(maxIsland,island(grid,i,j));
                }
            }
        }
        return maxIsland;
    }
    private int island(int[][] grid,int i,int j)
    {
        int sum=0;
        grid[i][j]=0;
        sum++;
        if(i!=0 && grid[i-1][j]==1)
        {
            sum+=island(grid,i-1,j);
        }
        if(j!=grid[i].length-1 && grid[i][j+1]==1)
        {
            sum+=island(grid,i,j+1);
        }
        if(i!=grid.length-1 && grid[i+1][j]==1)
        {
            sum+=island(grid,i+1,j);
        }
        if(j!=0 && grid[i][j-1]==1)
        {
            sum+=island(grid,i,j-1);
        }
        return sum;
    }
}
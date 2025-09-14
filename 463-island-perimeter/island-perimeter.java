class Solution {
    public int islandPerimeter(int[][] grid) {
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                {
                    return island(grid,i,j);
                }
            }
        }
        return 0;
    }
    private int island(int[][] grid, int i, int j)
    {
        grid[i][j]=2;
        int perimeter=0;
        if(j==0 || grid[i][j-1]==0) perimeter++;
        if(i==0 || grid[i-1][j]==0) perimeter++;
        if(j==grid[i].length-1 || grid[i][j+1]==0) perimeter++;
        if(i==grid.length-1 || grid[i+1][j]==0) perimeter++;
        if(j!=grid[i].length-1 && grid[i][j+1]==1)
        {
            perimeter+=island(grid,i,j+1);
        }
        if(i!=grid.length-1 && grid[i+1][j]==1)
        {
            perimeter+=island(grid,i+1,j);
        }
        if(j!=0 && grid[i][j-1]==1)
        {
            perimeter+=island(grid,i,j-1);
        }
        if(i!=0 && grid[i-1][j]==1)
        {
            perimeter+=island(grid,i-1,j);
        }
        return perimeter;
    }
}
class Solution {
    public int minPathSum(int[][] grid) {
        int[][] min=new int[grid.length][grid[0].length];
        return dfs(grid,0,0,grid.length,grid[0].length,min);
    }
    private int dfs(int[][] grid,int i,int j,int x,int y,int[][] min)
    {
        if(i==x-1 && j==y-1)
        {
            return grid[i][j];
        }
        if(min[i][j]!=0) return min[i][j];
        if(i==x-1)
        {
            return min[i][j]=grid[i][j]+dfs(grid,i,j+1,x,y,min);
        }
        else if(j==y-1)
        {
            return min[i][j]=grid[i][j]+dfs(grid,i+1,j,x,y,min);
        }
        else
        {
            return min[i][j]=grid[i][j]+Math.min(dfs(grid,i+1,j,x,y,min),dfs(grid,i,j+1,x,y,min));
        }
    }
}
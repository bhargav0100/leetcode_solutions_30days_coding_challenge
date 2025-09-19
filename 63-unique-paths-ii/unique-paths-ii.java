class Solution {
    int[][] t=new int[101][101];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        return unique(obstacleGrid,0,0,m,n);
    }
    private int unique(int[][] obstacleGrid,int i,int j,int m,int n)
    {
        if(i<0 || i>=m || j<0 || j>=n || obstacleGrid[i][j]==1)
        {
            return 0;
        }
        if(i==m-1 && j==n-1)
        {
            return 1;
        }
        if(t[i][j]!=0)
        {
            return t[i][j];
        }
        int right=unique(obstacleGrid,i,j+1,m,n);
        int down=unique(obstacleGrid,i+1,j,m,n);
        return t[i][j]=right+down;
    }
}
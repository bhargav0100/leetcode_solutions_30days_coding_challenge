class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int max=0;
        int[][] used=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                max=Math.max(max,dfs(matrix,i,j,used));
            }
        }
        return max;
    }
    private int dfs(int[][] matrix,int i,int j,int[][] used)
    {
        if(used[i][j]>0) return used[i][j];
        int max=0;
        int x=0;
        int y=0;
        x=i+0;
        y=j+1;
        if(y<matrix[i].length && matrix[i][j]<matrix[x][y])
        {
            max=Math.max(max,dfs(matrix,x,y,used));
        }
        x=i;
        y=j-1;
        if(y>=0 && matrix[i][j]<matrix[x][y])
        {
            max=Math.max(max,dfs(matrix,x,y,used));
        }
        x=i-1;
        y=j;
        if(x>=0 && matrix[i][j]<matrix[x][y])
        {
            max=Math.max(max,dfs(matrix,x,y,used));
        }
        x=i+1;
        y=j;
        if(x<matrix.length && matrix[i][j]<matrix[x][y])
        {
            max=Math.max(max,dfs(matrix,x,y,used));
        }
        used[i][j]=max+1;
        return max+1;
    }
}
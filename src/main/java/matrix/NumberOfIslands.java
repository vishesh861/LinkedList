package matrix;

public class NumberOfIslands {

    public int count(char[][] grid) {
        int ans =0;
        int r = grid.length;
        int c = grid[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]=='1')
                {
                    recursion(i,j,r,c,grid);
                    ans++;
                }
            }
        }
        return ans;
    }

    private static void recursion(int i,int j,int r,int c,char[][] grid)
    {
        if(i<0 || i>=r || j<0 || j>=c) {
            return;
        }
        if(grid[i][j]=='1') {
            grid[i][j]='*';


            recursion(i-1,j,r,c,grid);
            recursion(i,j-1,r,c,grid);
            recursion(i+1,j,r,c,grid);
            recursion(i,j+1,r,c,grid);
        }
        else {
            return;
        }
    }

}

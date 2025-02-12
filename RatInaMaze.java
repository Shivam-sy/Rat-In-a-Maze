//Write a program to check whether the rat can pass through the grid and reach at (n-1,m-1) position.
class RatInaMaze{
    public static boolean rIAM(int[][] grid,int n,int m,int r,int c){
        //Base Case:For Right Movement and grid[r][c+1]==0 checks whether the cell is free or not.
        
        if(r==n-1 && c==m-1)
        return true;
        //Recursive case:For down Movement and grid[r+1][c]==0 checks whether the cell is free or not.
        if((c+1)<m && grid[r][c+1]==0){
            if(rIAM(grid,n,m,r,c+1))
            return true;

        }
        if((r+1)<n && grid[r+1][c]==0){
            if(rIAM(grid,n,m,r+1,c))
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int [][] grid={
        {0,0,0,0,0},
        {0,1,1,0,1},
        {0,0,1,1,1},
        {0,0,0,0,1}};
        System.out.println(rIAM(grid,4,5,0,0));
        
    }
}
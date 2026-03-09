// There is a knight on an n x n chessboard. In a valid configuration,
// the knight starts at the top-left cell of the board and visits every
// cell on the board exactly once.
// max 8 places
// Up left , up right
// Down left , Down right
// Left up , Left Down
// Right up , Right Down


public class _1KnightTour {

    public static void main(String[] args) {
      int[][] grid = { {0,11,16,5,20},
                       {17,4,19,10,15},
                       {12,1,8,21,6},
                       {3,18,23,14,9},
                       {24,13,2,7,22}
      };

        System.out.println(checkValidGrid(grid));
    }

    public static boolean checkValidGrid(int[][] grid){
        if (grid[0][0] != 0) return false;
       return helper(grid,0,0,0);
    }

    private static boolean helper(int[][] grid, int row, int col, int num) {
     int n = grid.length;
     // base case
       if (grid[row][col]== n*n -1) return true;

     int i , j;
       // 2 Up 1 right
        i = row - 2;
        j = col + 1;
        if(i >= 0 && j < n && grid[i][j] == num+1)
          return helper(grid,i,j,num+1);
        // 2 Up 1 left
        i = row - 2;
        j = col - 1;
        if(i >= 0 && j >= 0 && grid[i][j] == num+1)
            return helper(grid,i,j,num+1);

        // 2 Down 1 right
        i = row + 2;
        j = col + 1;
        if(i < n && j < n && grid[i][j] == num+1)
            return helper(grid,i,j,num+1);
        // 2 Down 1 left
        i = row + 2;
        j = col - 1;
        if(i < n && j >= 0 && grid[i][j] == num+1)
            return helper(grid,i,j,num+1);

        // 2 Right 1 Up
        i = row - 1;
        j = col + 2;
        if(i >= 0 && j < n  && grid[i][j] == num+1)
            return helper(grid,i,j,num+1);
        // 2 Right 1 Down
        i = row + 1;
        j = col + 2;
        if(i < n && j < n  && grid[i][j] == num+1)
            return helper(grid,i,j,num+1);

        // 2 left 1 Up
        i = row - 1;
        j = col - 2;
        if(i >= 0 && j >= 0  && grid[i][j] == num+1)
            return helper(grid,i,j,num+1);
        // 2 left 1 Down
        i = row + 1;
        j = col - 2;
        if(i < n && j >= 0 && grid[i][j] == num+1)
            return helper(grid,i,j,num+1);

        return false;
    }
}

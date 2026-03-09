//Tell the max no.  of knights that can be placed in a n*n dashboard
// and also number of knight
public class _2maxKnightsInNxNBoard {

    static int maxKnight = -1;
    static int number = 8;

    // Checks if it is safe to place a knight at (row, col) on the board
    // A knight is safe if no other knight can attack it from its possible moves
    public static boolean isSafe(char[][] board , int row , int col){
        int n = board.length;
        int i , j;
        // 2 Up 1 right
        i = row - 2;
        j = col + 1;
        if(i >= 0 && j < n && board[i][j] == 'K') return false;
        // 2 Up 1 left
        i = row - 2;
        j = col - 1;
        if(i >= 0 && j >= 0 && board[i][j] == 'K') return false;

        // 2 Down 1 right
        i = row + 2;
        j = col + 1;
        if(i < n && j < n && board[i][j] == 'K') return false;
        // 2 Down 1 left
        i = row + 2;
        j = col - 1;
        if(i < n && j >= 0 && board[i][j] == 'K') return false;

        // 2 Right 1 Up
        i = row - 1;
        j = col + 2;
        if(i >= 0 && j < n  && board[i][j] == 'K') return false;
        // 2 Right 1 Down
        i = row + 1;
        j = col + 2;
        if(i < n && j < n  && board[i][j] == 'K') return false;

        // 2 left 1 Up
        i = row - 1;
        j = col - 2;
        if(i >= 0 && j >= 0  && board[i][j] == 'K') return false;
        // 2 left 1 Down
        i = row + 1;
        j = col - 2;
        if(i < n && j >= 0 && board[i][j] == 'K') return false;
        // No attacking knight found — safe to place
        return true;
    }

    // Recursive backtracking function to try placing knights
    // row, col → current position being checked
    // num → number of knights placed so far
    public static void nKnight(char[][] board , int row , int col , int num){
       int n = board.length;
        if(row == n) { // base case
           if (num == number){
               for (int i = 0; i < n; i++) {
                   for (int j = 0; j <n ; j++) {
                       System.out.print(board[i][j]+" ");
                   }
                   System.out.println();
               }
               System.out.println();
           }
            // Update the maximum knights placed
            maxKnight = Math.max(maxKnight,num);
            return;
        }

        // Option 1: Place a knight here (if safe), then move to next cell
      else if (isSafe(board,row,col)) {
            board[row][col] = 'K'; // place knight
            // Move to next cell in the row or go to next row
            if (col != n - 1)
                nKnight(board,row,col+1,num+1);
            else
                nKnight(board,row+1,0,num+1);
            board[row][col] = 'x';  // backtrack
        }

   // Option 2: Skip this cell, move to next cell
        if (col != n - 1)
            nKnight(board,row,col+1,num);
        else
            nKnight(board,row+1,0,num);

    }

    public static void main(String[] args) {
        int n = 4;
        // creating chessboard
        char[][] board = new char[n][n];
        // Initial fill with 'x' meaning empty cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                board[i][j] = 'x';
            }
        }
        // Start backtracking from (0,0) with 0 knights placed
        nKnight(board,0,0,0);

        // Print the maximum knights possible
        System.out.println(maxKnight);
    }


}


//  homework :- places k >= n knights in n*m dashboard

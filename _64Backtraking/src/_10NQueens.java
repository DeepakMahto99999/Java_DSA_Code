// The n-queens puzzle is the problem of placing n queens on an n x n
// chessboard such that no two queens attack each other
// input: n = 4
// output: { 0, 1, 0,0}
//         {0, 0 , 0 ,1}
//         {1, 0, 0, 0}
//         {0, 0, 1, 0}



public class _10NQueens {

    public static void main(String[] args) {
        int n = 4;
        // creating chessboard
        char[][] board = new char[n][n];
        // initial fill with 'X'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                board[i][j] = '.';
            }
        }
        // 0 is row
       nQueen(board,0);
    }

    private static void nQueen(char[][] board, int row) {
        int n = board.length;

         if(row == n) { // base case
             for (int i = 0; i < n; i++) {
                 for (int j = 0; j <n ; j++) {
                     System.out.print(board[i][j]+" ");
                 }
                 System.out.println();
             }
             System.out.println();
             return;
         }
        // can i fill the queen yes or not --> search safe point
        for (int j = 0; j < n; j++) { // work and call
            if (isSafe(board,row,j)) {
                // mark queen
                board[row][j] = 'Q';
                // if queen is mark safe then go to next row
                nQueen(board,row+1);
                // if filling queen is not safe , but we have fill in every row
                board[row][j] = '.'; // backtracking
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        // check row --> East and West
        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q') return false;
        }

        // check col --> North and West
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // check north east
        int i = row;
        int j = col;
        while (i >= 0 && j < n){
            if (board[i][j] == 'Q') return false;
            i--;
            j++;
        }

        // check north west
        i = row;
        j = col;
        while (i >=0 && j >= 0){
            if (board[i][j] == 'Q') return false;
            i--;
            j--;
        }

        // check south east
           i = row;
           j = col;
        while (i < n && j < n){
            if (board[i][j] == 'Q') return false;
            i++;
            j++;
        }

        // check south west
        i = row;
        j = col;
        while (i < n && j >= 0){
            if (board[i][j] == 'Q') return false;
            i++;
            j--;
        }

        return true;
    }
}

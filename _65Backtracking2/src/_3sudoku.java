// check valid sudoku
// if you want to find 3 x 3 small matrix   in 9*9 matrix
// Initial Sudoku board (0 represents empty cells)
//
//     0 1 2   3 4 5   6 7 8
// 0 | 5 3 0 | 0 7 0 | 0 0 0
// 1 | 6 0 0 | 1 9 5 | 0 0 0
// 2 | 0 9 8 | 0 0 0 | 0 6 0
//   |-------+-------+-------
// 3 | 8 0 0 | 0 6 0 | 0 0 3
// 4 | 4 0 0 | 8 0 3 | 0 0 1
// 5 | 7 0 0 | 0 2 0 | 0 0 6
//   |-------+-------+-------
// 6 | 0 6 0 | 0 0 0 | 2 8 0
// 7 | 0 0 0 | 4 1 9 | 0 0 5
// 8 | 0 0 0 | 0 8 0 | 0 7 9

// in (2 , 6) have 6 and you want to find left corner cell
// step:-1 (2/3 , 6/3) :- (0 , 2)
// step:-2 (0*3 , 2*3) :- (0 , 6)


public class _3sudoku {

    public static void main(String[] args) {
        char[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        System.out.println(isValidSudoku(board));
    }

    private static boolean isValidSudoku(char[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {              // loop through each row
            for (int j = 0; j < n; j++) {          // loop through each column
                if(board[i][j] == 0) continue;     // skip if cell is empty (0 means blank in Sudoku)

                char num = board[i][j];            // store the current number
                board[i][j] = 0;                    // temporarily remove it from the board
                                                  // (so it doesn't match itself in checks)

                if(isValid(board, i, j, num) == false) // check if putting 'num' here is valid
                    return false;                  // if invalid, Sudoku is not valid → stop immediately

                board[i][j] = num;                  // put the number back after checking
            }
        }

        return true;
    }

    private static boolean isValid(char[][] board, int row, int col, char num) {
        int n = board.length;

        // check row
        for (int j = 0; j < n ; j++) {
           if (board[row][j] == num) return false;
        }

        // check col
        for(int i = 0; i < n; i++) {
            if (board[i][col] == num) return false;
        }

        // check 3 x 3 grid  s --> starting
        int sRow = row/3*3;
        int sCol = col/3*3;
        for (int i = sRow; i < sRow+3 ; i++) {
            for (int j = sCol; j < sCol+3 ; j++){
                if (board[i][j] == num) return false;
            }
        }
        return true;
    }
}

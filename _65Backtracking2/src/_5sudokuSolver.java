public class _5sudokuSolver {

    // Global flag to indicate if a solution is found
    static int check = 0;

    public static void main(String[] args) {

        // Initial Sudoku board ('.' means empty cell)
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        // Call the solver
        solveSudoku(board);

        // Print the solved Sudoku board
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    // Public method to start solving Sudoku
    public static void solveSudoku(char[][] board) {
        solve(board, 0, 0); // start from top-left cell (0,0)
        check = 0; // reset check flag for potential future runs
    }

    // Recursive function to solve Sudoku using backtracking
    private static void solve(char[][] board, int row, int col) {

        int n = board.length; // board size (9 for standard Sudoku)

        // Base case: if we have filled all rows, solution is found
        if (row == n) {
            check = 1; // mark solution found
            return;
        }

        // If the current cell already contains a number, move to the next cell
        if (board[row][col] != '.') {
            if (col != n - 1) // not last column → move to next column
                solve(board, row, col + 1);
            else // last column → move to next row, col reset to 0
                solve(board, row + 1, 0);
        } else {
            // Try placing digits '1' to '9' in the empty cell
            for (char ch = '1'; ch <= '9'; ch++) {
                if (isValid(board, row, col, ch)) { // check if valid placement
                    board[row][col] = ch; // place the number

                    // Move to the next cell
                    if (col != n - 1)
                        solve(board, row, col + 1);
                    else
                        solve(board, row + 1, 0);

                    // If solution found, stop further recursion
                    if (check == 1) return;

                    // Backtracking: undo the placement
                    board[row][col] = '.';
                }
            }
        }
    }

    // Checks whether placing 'num' at board[row][col] is valid
    private static boolean isValid(char[][] board, int row, int col, char num) {
        int n = board.length;

        // Check entire row
        for (int j = 0; j < n; j++) {
            if (board[row][j] == num) return false;
        }

        // Check entire column
        for (int i = 0; i < n; i++) {
            if (board[i][col] == num) return false;
        }

        // Check the 3x3 subgrid containing this cell
        int sRow = row / 3 * 3; // starting row of subgrid
        int sCol = col / 3 * 3; // starting column of subgrid
        for (int i = sRow; i < sRow + 3; i++) {
            for (int j = sCol; j < sCol + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }

        // No conflicts found → placement is valid
        return true;
    }
}

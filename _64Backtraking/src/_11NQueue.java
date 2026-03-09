import java.util.ArrayList;

public class _11NQueue {

    public static void main(String[] args) {
        int n = 4;
        ArrayList<ArrayList<String>> a = solveNQueens(n);
        for (ArrayList<String> solution : a) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }

    }

    public static ArrayList<ArrayList<String>> solveNQueens(int n){
        // creating chessboard
        char[][] board = new char[n][n];
        // initial fill with 'X'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                board[i][j] = '.';
            }
        }
        // for ans
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        // 0 is row
        nQueen(board,0,ans);
        return ans;
    }

    private static void nQueen(char[][] board, int row,ArrayList<ArrayList<String>> ans) {
        int n = board.length;

        if(row == n) { // base case
          // copy 2D character array into Arraylist of string
            ArrayList<String> l = new ArrayList<>();
            for (int i = 0; i < n ; i++) {
                String str = "";
                for (int j = 0; j < n; j++) {
                    str += board[i][j];
                }
                l.add(str);
            }
            ans.add(l);
            return;
        }

        // can i fill the queen yes or not --> search safe point
        for (int j = 0; j < n; j++) { // work and call
            if (isSafe(board,row,j)) {
                // mark queen
                board[row][j] = 'Q';
                // if queen is mark safe then go to next row
                nQueen(board,row+1,ans);
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

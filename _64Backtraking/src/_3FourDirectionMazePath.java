public class _3FourDirectionMazePath {

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        boolean[][] isVisited = new boolean[rows][cols];
//        print1(0,0,rows-1,cols-1,"");
//        print2(0,0,rows-1,cols-1,"",isVisited);
        print3(0,0,rows-1,cols-1,"",isVisited);

    }

    // this will create infinite path
    private static void print1(int sr, int sc, int er, int ec , String s) {
        if(sr < 0 || sc < 0) return;
        if (sr > er || sc > ec) return;
        if (sr==er && sc == ec) {
            System.out.println(s);
            return;
        }
        // go right
        print1(sr,sc+1,er,ec,s+"R");
        // go down
        print1(sr+1,sc,er,ec,s+"D");
        // go left
        print1(sr,sc-1,er,ec,s+"L");
        // go up
        print1(sr-1,sc,er,ec,s+"U");

    }

    // this will resolve the infinite path
    private static void print2(int sr, int sc, int er, int ec , String s , boolean[][] isVisited) {
        if(sr < 0 || sc < 0) return;
        if (sr > er || sc > ec) return;
        if(isVisited[sr][sc]) return;
        if (sr==er && sc == ec) {
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        // go right
        print2(sr,sc+1,er,ec,s+"R" ,isVisited);
        // go down
        print2(sr+1,sc,er,ec,s+"D",isVisited);
        // go left
        print2(sr,sc-1,er,ec,s+"L",isVisited);
        // go up
        print2(sr-1,sc,er,ec,s+"U",isVisited);

    }

    private static void print3(int sr, int sc, int er, int ec , String s , boolean[][] isVisited) {
        if(sr < 0 || sc < 0) return;
        if (sr > er || sc > ec) return;
        if(isVisited[sr][sc]) return;
        if (sr==er && sc == ec) {
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        // go right
        print3(sr,sc+1,er,ec,s+"R" ,isVisited);
        // go down
        print3(sr+1,sc,er,ec,s+"D",isVisited);
        // go left
        print3(sr,sc-1,er,ec,s+"L",isVisited);
        // go up
        print3(sr-1,sc,er,ec,s+"U",isVisited);

        // backtracking
        isVisited[sr][sc] = false;

    }
}

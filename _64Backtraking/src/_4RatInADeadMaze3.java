// A maze is an N*N binary matrix of blocks where the upper left block
// is known as the source block, and the lower rightmost block is known as
// the Destination block. if we consider the maze . then maze[0][0] is the source
// and maze[N-1][N-1] is the destination. Our main task is to reach the destination
// from the source .we have considered a rat as a character that can move either forward
// or downwards

// In the maze matrix, a few dead blocks will be denoted by 0 and active blocks
// will be denoted by 1. A rat can move only is the active blocks.

// starting row
public class _4RatInADeadMaze3 {

    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] maze = { {1,0,1,1,1,1},
                         {1,1,1,1,0,1},
                         {0,1,1,1,1,1},
                         {0,0,1,0,1,1} };
        print(0,0,rows-1,cols-1,"",maze);
    }

    private static void print(int sr, int sc , int er , int ec, String s, int[][]maze){
        if (sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }

        if(maze[sr][sc]==0) return;

        // go right
        print(sr,sc+1,er,ec,s+"R",maze);
        // go down
        print(sr+1,sc,er,ec,"C",maze);

    }
}

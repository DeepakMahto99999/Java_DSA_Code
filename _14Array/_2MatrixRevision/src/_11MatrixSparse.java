// 0 0 5
// 0 0 0
// 7 0 0
// Total elements = 9
// Zero elements = 7
// Non-zero elements = 2
// Since zeroes > non-zeroes ⇒ This is a sparse matrix
// If most elements are non-zero, then it is called a dense matrix.


public class _11MatrixSparse {

    public static boolean checkSparse(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int zeroCount  = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0) zeroCount ++;
            }
        }

        int total = row*col;
        int nonZeroCount = total - zeroCount;

        return zeroCount > nonZeroCount;
    }

    public static boolean checkSparse2(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int total = row * col;
        int nonZeroCount = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] != 0) {
                    nonZeroCount++;
                    if (nonZeroCount > total / 2) {
                        return false;  // already dense
                    }
                }
            }
        }
        return true;  // still sparse
    }

    public static boolean checkSparse3(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int nonZeroCount = 0;   // count of non-zeros

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] != 0) nonZeroCount++;
            }
        }

        int total = row * col;

        return nonZeroCount <= total / 2;  // sparse if non-zeros are half or less
    }

    public static void main(String[] args) {
     int[][] arr = { {0, 0, 5} ,
                     {0, 0 , 0} ,
                     {7,0,0}
                   };
        System.out.println(checkSparse(arr));
    }
}

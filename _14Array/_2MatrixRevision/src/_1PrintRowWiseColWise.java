public class _1PrintRowWiseColWise {

    // Print row-wise
    public static void printAllRow(int[][] arr) {
        int rows = arr.length;         // number of rows
        int cols = arr[0].length;      // number of columns

        for (int row = 0; row < rows; row++) {          // go row by row
            for (int col = 0; col < cols; col++) {      // go across each column
                System.out.print(arr[row][col] + " ");  // element at (row, col)
            }
        }
        System.out.println();
    }

    // Print column-wise
    public static void printAllCol(int[][] arr) {
        int rows = arr.length;         // number of rows
        int cols = arr[0].length;      // number of columns

        for (int col = 0; col < cols; col++) {          // go column by column
            for (int row = 0; row < rows; row++) {      // go down each row
                System.out.print(arr[row][col] + " ");  // element at (row, col)
            }
        }
        System.out.println();
    }

    public static int totalSumMatrix(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        int sum = 0;
        for (int i =0; i < row; i++){
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Row-wise printing:");
        printAllRow(arr);

        System.out.println("Col-wise printing:");
        printAllCol(arr);

        System.out.println(totalSumMatrix(arr));
    }
}

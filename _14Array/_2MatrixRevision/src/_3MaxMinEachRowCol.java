public class _3MaxMinEachRowCol {

    // Max & Min in each row
    public static void maxMinInRow(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            int max = arr[i][0]; // first element of the row
            int min = arr[i][0]; // first element of the row
            for (int j = 0; j < col; j++) {
                if (max < arr[i][j]) max = arr[i][j];
                if (min > arr[i][j]) min = arr[i][j];
            }
            System.out.println("Row " + i + " -> max: " + max + ", min: " + min);
        }
    }

    // Max & Min in each column
    public static void maxMinInCol(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < col; i++) {
            int max = arr[0][i]; // first element of the column
            int min = arr[0][i]; // first element of the column
            for (int j = 0; j < row; j++) {
                if (max < arr[j][i]) max = arr[j][i];
                if (min > arr[j][i]) min = arr[j][i];
            }
            System.out.println("Column " + i + " -> max: " + max + ", min: " + min);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        maxMinInRow(arr);
        System.out.println();
        maxMinInCol(arr);
    }
}

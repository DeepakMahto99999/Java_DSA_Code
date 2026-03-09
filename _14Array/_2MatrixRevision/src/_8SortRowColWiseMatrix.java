import java.util.Arrays;

public class _8SortRowColWiseMatrix {

    // Sort each row
    public static void rowWiseSort(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]); // sort row using Arrays.sort
        }
    }

    // Sort each column
    public static void colWiseSort(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        for (int j = 0; j < col; j++) {
            int[] temp = new int[row];
            for (int i = 0; i < row; i++) {
                temp[i] = arr[i][j]; // extract column
            }
            Arrays.sort(temp); // sort column
            for (int i = 0; i < row; i++) {
                arr[i][j] = temp[i]; // put back sorted values
            }
        }
    }

    // Utility method to print matrix
    public static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = {
                {11, 2, 3},
                {14, 14, 56},
                {74, 8, 91}
        };

        System.out.println("Original Matrix:");
        printMatrix(arr1);

        rowWiseSort(arr1);
        System.out.println("\nAfter Row-wise Sort:");
        printMatrix(arr1);

        colWiseSort(arr1);
        System.out.println("\nAfter Column-wise Sort:");
        printMatrix(arr1);
    }
}

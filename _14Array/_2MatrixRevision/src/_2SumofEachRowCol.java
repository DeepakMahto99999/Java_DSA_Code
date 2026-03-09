public class _2SumofEachRowCol {

    // Sum of each row
    public static void sumEachRow(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        System.out.print("Row sums: ");
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    // Sum of each column
    public static void sumEachCol(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        System.out.print("Column sums: ");
        for (int j = 0; j < col; j++) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                sum += arr[i][j];
            }
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        sumEachRow(arr);
        sumEachCol(arr);
    }
}

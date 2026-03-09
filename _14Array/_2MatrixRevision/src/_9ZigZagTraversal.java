public class _9ZigZagTraversal {

    public static void zigZagPattern(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                // left to right
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // right to left
                for (int j = col - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        zigZagPattern(arr);
    }
}

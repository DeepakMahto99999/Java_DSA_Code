public class _6LeftRightDiagonal {

    public static void leftRightDiagonal(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        System.out.println("left Diagonal");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();

        System.out.println("Right Diagonal");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i + j == row -1){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        leftRightDiagonal(arr);
    }
}

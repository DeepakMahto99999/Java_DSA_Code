public class _5printUpperLowerTriangle {

    public static void upperLowerTriangle(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i==j) continue;
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void upperLowerTriangle2(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        System.out.print("Upper Triangle: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i < j) { // upper triangle
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        System.out.print("\nLower Triangle: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i > j) { // lower triangle
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        upperLowerTriangle(arr1);
        upperLowerTriangle2(arr1);
    }
}

// Spiral Order Traversal
public class _1Q {

    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] matrix , int r, int c){
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElement = 0;

        while (totalElement < r * c) {
            // top row -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && totalElement < r*c; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElement++;
            }
            topRow++;

            // rightCol -> top to bottomRow
            for (int i = topRow; i <= bottomRow && totalElement < r*c; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && totalElement < r*c; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;

            // leftCol -> bottom to topRow
            for (int i = bottomRow; i >= topRow && totalElement < r*c; i--) {
                System.out.print(matrix[i][leftCol] + " ");
                totalElement++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        int r = 5;
        int c = 5;
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        printMatrix(matrix);
        printSpiralOrder(matrix, r, c);
        System.out.println();  // For better formatting of output
    }
}

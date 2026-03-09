public class _2Q {
    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }



    }

    static void transposeInPlace(int[][] matrix, int r , int c){
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                // swap matrix[i][j , matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }
    }

    static void  reverseArray(int[] arr){
           int i =0, j = arr.length-1;
           while (i < j ){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i++;
               j--;
           }
    }

    static void rotateMatrix(int[][] matrix, int n){
         // transpose
        transposeInPlace(matrix, n , n);
        // reverse each row of transposed matrix
        for (int i = 0; i < n; i++) {
            reverseArray(matrix[i]);
        }
    }

    public static void main(String[] args){
        int r = 4;
        int c =4;
       int[][] matrix = { {1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}
                         };
        rotateMatrix(matrix ,r );
        printMatrix(matrix);

    }
}

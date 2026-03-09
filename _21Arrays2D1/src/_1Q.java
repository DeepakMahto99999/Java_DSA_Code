// transpose of matrix

public class _1Q {

    static void printArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int[][] matrix , int r  , int c){
        int[][] ans = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
          return ans;
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

    public static void main(String[] args) {

        int r =3;
        int c = 3;
        int[][] matrix = {{1,2,3 } , {4,5,6 } , {7,8,9 }  };

//        int[][] ans = findTranspose(matrix , r , c);

        transposeInPlace(matrix , r , c);
        printArray(matrix);

    }
}

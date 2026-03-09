// Given an integer n , return the first n rows of pascal triangle
// in pascal triangle, each number in the sum of the two numbers
// directly above it as shown:


public class _3Q {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    static int[][] pascalTriangle( int n){
            int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            // ith row has i+1 column
            /*
            ans[0] = new int[1]
            ans[1] = new int[2]
             */
          ans[i] = new int[i+1];
          // 1st and last element of every row is 1
           ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }

            return ans;
    }

    public static void main(String[] args) {
        int n =5;
      int[][] ans = pascalTriangle(n);
      printMatrix(ans);
    }
}

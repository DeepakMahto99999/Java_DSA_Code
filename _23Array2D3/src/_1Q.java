// Given a matrix "a" of dimension n * m and 2 coordinates(l1,r1)
// and (l2 , r2) . Return the sum of rectangle from (l1 , r1) to (l2 ,r2)
// l2 >= l1 , r2 >= r1
// 0 <= l1 , l2  < n
// 0 <= r1 , r2   < m

public class _1Q {

    static void findPrefixSumMatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        // traverse horizontally to calculate row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j-1];
            }
        }

    }


    // calculate row-wise and column wise sum
    // matrix[i][j] = sumRectangle ( (0,0) (i,j) )

    static void findPrefixSumMatrixRowColumn(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        // traverse horizontally to calculate row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j-1];
            }
        }

        // traverse Vertically to calculate row-wise prefix sum
        for (int j = 0; j < c; j++) { // fixing column
            for (int  i= 1; i < r; i++) {
                matrix[i][j] +=matrix[i-1][j];
            }
        }
    }

    static int findSum(int[][] matrix, int l1, int r1 , int l2 , int r2){
        int sum =0;

        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2 ; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }


    static int findSum2(int[][] matrix, int l1, int r1 , int l2 , int r2){
        int sum =0;
        findPrefixSumMatrix(matrix);
        for (int i = l1; i <=l2 ; i++) {
            // r1 to r2 sum for row i
            if(r1 >=1){
                sum +=matrix[i][r2] - matrix[i][r1-1];
            } else{
                sum += matrix[i][r2];
            }
        }

        return  sum;
    }

    static int findSum3(int[][] matrix, int l1, int r1 , int l2 , int r2){
        int ans =0,sum = 0, up =0, left =0 , leftUp =0;
        findPrefixSumMatrixRowColumn(matrix);

        sum = matrix[l2][r2];
        if(r1 >= 1) {
           left = matrix[l2][r1 -1];
        }
        if(l1 >=1){
           up = matrix[l1-1][r2];
        }
        if(l1 >=1 && r1 >=1){
        leftUp = matrix[l1-1][r1-1];
        }
        ans = sum - up - left + leftUp;
        return ans;

    }
    public static void main(String[] args) {
        int row = 3 ;
        int column =3 ;
        int[][] matrix = { {1 , 2 , 3 },
                           {2 , 1 ,1} ,
                           {3 , 2 ,1}
                         } ;
        int l1 = 0 ;
        int r1 =  0;
        int l2 =  2;
        int r2 =  2;

        System.out.println("Rectangle Sum " + findSum(matrix , l1 ,r1 , l2 ,r2));
        System.out.println("Rectangle Sum " + findSum2(matrix , l1 ,r1 , l2 ,r2));
//        System.out.println("Rectangle Sum " + findSum3(matrix , l1 ,r1 , l2 ,r2));

    }
}

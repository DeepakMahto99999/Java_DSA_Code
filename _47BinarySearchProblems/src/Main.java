// Search the 'target' value in a 2d integer matrix of dimensions n x m
// and return true if found , else return false .
// this matrix has following properties
// 1. Integer in each row are sorted from left to right
// 2. the first integer of each row is greater than the last integer of
// the previous row.
// input:
// Matrix =[ {1,2,5,7} , {10,11,16,20} , {23 , 30 ,34 ,60}] , target =3
// output: true


public class Main {

    static boolean search(int[][] matrix , int target){
        int n = matrix.length;
        int r = matrix[0].length;

        for (int i = 0; i < n; i++) {
            int st =0 , end = r-1;
            while(st <= end){
                int mid = st + (end - st)/2;
                if(target == matrix[i][mid]){
                    return true;
                } else if ( matrix[i][mid] > target) {
                    st = mid +1;
                } else {
                    end = mid -1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
     int[][] matrix = {{1,2,5,7} , {10,11,16,20} , {23 , 30 ,34 ,60}};
     int target = 23;
        System.out.println(search(matrix , target));
    }
}

public class searchMatrix {

    static boolean searchMatrix(int[][] a , int target) {
        int n = a.length;
        int m = a[0].length;

        int st =0 , end = m*n-1;
        while (st <= end){
            int mid = st + (end -st)/2;
            if(target == a[mid/m][mid%m]) return true;
            else if (target < a[mid/m][mid%m]) {
                end = mid -1;
            }else{
             st = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,5,7},
                         {10,11,16,20},
                          {23 , 30 ,34 ,60}};
        int target = 4;
        System.out.println(searchMatrix(matrix , target));
    }
}

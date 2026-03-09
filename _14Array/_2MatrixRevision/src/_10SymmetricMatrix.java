// Aij = Aji
public class _10SymmetricMatrix {

    public static boolean symmetric(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        if (row != col) return false;

        for (int i = 0; i < row; i++) {
            for (int j = i+1; j < col; j++) { // skip diagonal to avoid repeats
                if (arr[i][j] != arr[j][i] ) return false;
            }
        }

        return true;

    }


    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {2,4,5},
                {3,5,6}
        };
        System.out.println(symmetric(arr));
    }
}

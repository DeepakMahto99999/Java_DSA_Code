public class _4AddSubtractTwoMatrix {

    public static int[][] addTwoMatrix(int[][] arr1 , int[][] arr2){
        int row = arr2.length;
        int col = arr2[0].length;

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               arr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        int[][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] arr = addTwoMatrix(arr1,arr2);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

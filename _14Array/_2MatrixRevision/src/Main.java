import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void printAllRow(int[][] arr ){
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] +" ");
            }
        }
    }

    public static void printAllCol(int[][] arr ){
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[j][i] +" ");
            }
        }
    }

    public static int[] maxEachRow(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        int[] result = new int[row];

        for (int i = 0; i < row; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max ) max = arr[i][j];
            }
            result[i] = max;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Row-wise printing:");
        printAllRow(arr);

        System.out.println("Col-wise printing:");
       printAllCol(arr);


    }
}
// Addition of two matrix
public class _1Q {
    public static void main(String[] args) {
        int[][] arr = { {2,3} , {4,5} };
        int[][] arr2 = { {1,2} , {3,4}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}

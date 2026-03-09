//     +
//     +
//     +
//     +
// +++++++++
//     +
//     +
//     +
//     +

import java.util.Scanner;

public class _14Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=2*n-1 ; i++) {
            if (i == n) {
                for (int j = 1; j <=2*n-1 ; j++) {
                    System.out.print("+\t");
                }
            } else {

            for (int j = 1; j <= n-1 ; j++) {
                System.out.print("\t");
            }

                System.out.print("+\t");

            }
            System.out.println();
        }
    }
}

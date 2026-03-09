// ***
//*   *
//*   *
//*   *
// ***
//*   *
//*   *
//*   *
// ***

import java.util.Scanner;

public class _16Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int N = sc.nextInt();

        for (int i = 1; i < N * 2; i++) {

            for (int j = 1; j <= N; j++) {
                if ((i == 1 && (j == 1 || j == N)) ||
                        (i == N && (j == 1 || j == N)) ||
                        (i == N * 2 - 1 && (j == 1 || j == N))) {
                    System.out.print(" ");
                } else if (i == 1 || i == N || i == (N * 2) - 1 || j == 1 || j == N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


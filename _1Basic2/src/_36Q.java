//13579
//3579
//579
//79
//9


import java.util.Scanner;
public class _36Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 2*i - 1; j <= 2 * n - 1; j += 2) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = n; i>=1 ; i--) {
            for (int j = 2*i-1; j <= 2*n-1 ; j+=2) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

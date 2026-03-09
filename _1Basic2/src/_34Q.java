import java.util.Scanner;

public class _34Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            for (int j = i; j <=2*i-1 ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= n; i++) {
            int k = i; // k = current row no.
            // k increments with each column
            for (int j = 1; j <= i; j++, k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

//55555
//54444
//54333
//54322
//54321


import java.util.Scanner;

public class _26Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i =1; i <= n;i++){
//           for (int k = n; k >= n - i + 1; k--) {
//                    System.out.print(k);
//           }
//            for (int j = 1; j <= n-i ; j++) {
//                System.out.print(n-i+1);
//            }
//            System.out.println();
//        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(i);
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

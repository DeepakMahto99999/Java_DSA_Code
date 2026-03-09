//    1
//   22
//  333
// 4444
//55555

import java.util.Scanner;

public class _27Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            // Logic to print spaces
//            for (int j = i; j < n; j++) {
//                System.out.println(" ");
//            }
                for (int j = n-i; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

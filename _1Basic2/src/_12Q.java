// *
// **
// * *
// *  *
// *****

import java.util.Scanner;

public class _12Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
//                if (j == 1 || j ==n || i == n) {
                if (j == 1 || j ==i || i ==n) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

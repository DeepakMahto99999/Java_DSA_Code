import java.util.Scanner;

public class _15Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//            *
//         *  *
//      *  *  *
//   *  *  *  *
// * *  *  *  *

        int n = sc.nextInt();

        // Loop to print the pattern
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("\t");
            }
            // Print asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            // Move to the next line
            System.out.println();
        }

        sc.close(); // Close the scanner
    }
}
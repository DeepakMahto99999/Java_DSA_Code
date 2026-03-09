//1  2  3  4  5
//6  7  8  9 10
//11 12 13 14 15
//16 17 18 19 20
//21 22 23 24 25

import java.util.Scanner;

public class _25Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            for (int j =i*n-n+1 ; j <=i*n; j++) {
//                System.out.print(j+"\t");
//            }
//            System.out.println();
//        }

        int k = 1; // Initial value of the counter
        for (int i = 1; i <= n; i++) {       // Outer loop controls the rows
            for (int j = 1; j <= n; j++, k++) { // Inner loop controls the columns
                System.out.print(k + "\t");     // Print the current value of k
            }
            System.out.println(); // Move to the next line after printing all columns of a row
        }

    }
}
